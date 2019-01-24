new Vue({
	el : '#app',
	data : {
		/* 高级查询条件 */
		userId : '', // 用户编号
		userName : '', // 用户名
		startDate : '', // 开始提交时间
		endDate : '', // 结束提交时间
		identity : -1, // 身份证审核
		info : -1, // 详细信息审批
		view : -1, // 视频审批
		pageIndex : 1, // 当前页
		pageSize : 2, // 页容量
		totalPage : '', // 总页数

		/* 后台数据 */
		result : '',
		datas : [],
	},
	//当前页监控
	watch: {
        pageIndex: function(oldValue , newValue){
            console.log(arguments);
        }
    },
	methods : {
		search : function() {
			this.$http.get('http://10.1.13.18:8080/getDatas.action', {
				params : this.param
			}).then(function(result) {
				this.datas = result.data.userIdentifications;
				this.totalPage = result.data.totalPage;

			}, function() {
				console.log('请求处理失败');
			});
		},
		openAccount : function(A) {
			this.$http.get('http://10.1.13.18:8080/openAcount.action', {
				params : {
					id : A
				}
			}).then(function(result) {
				if (result.bodyText == 'ok') {
					this.search();
				}
				/* 调用带条件查询方法 */

			}, function() {
				consloe.log('请求处理失败');
			});
		},
		btnClick : function(data) {// 页码点击事件
			if (data != this.pageIndex) {
				this.pageIndex = data;
				this.search();
			}
		},
		pageClick : function(data) {
			if (data == -1) {
				this.pageIndex--;
			}else{
				this.pageIndex++;
			}
			this.search();
		},
	},
	// 初始化完成,发起请求获取后台数据
	mounted : function() {
		this.search();
	},
	// 计算url
	computed : {
		param : function() {
			return {
				User_Id : this.userId,
				User_Name : this.userName,
				Start_Submitdate : this.startDate,
				End_Submitdate : this.endDate,
				Identity_Audit : this.identity,
				Info_Audit : this.info,
				View_Audit : this.view,
				pageIndex : this.pageIndex,
				pageSize : this.pageSize
			}
		},
		indexs : function() {
			var left = 1;
			var right = this.totalPage;
			var ar = [];
			if (this.totalPage >= 5) {
				if (this.pageIndex > 3 && this.pageIndex < this.totalPage - 2) {
					left = this.pageIndex - 2
					right = this.pageIndex + 2
				} else {
					if (this.pageIndex <= 3) {
						left = 1
						right = 5
					} else {
						right = this.totalPage
						left = this.totalPage - 4
					}
				}
			}
			while (left <= right) {
				ar.push(left)
				left++
			}
			return ar
		}
	},
});
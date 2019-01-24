var pageBar = new Vue({
	el : '.page-bar',
	data : {
		all : 8, // 总页数
		cur : 1
	// 当前页码
	},
	watch : {
		cur : function(oldValue, newValue) {
			console.log(arguments);
		}
	},
	methods : {
		btnClick : function(data) {// 页码点击事件
			if (data != this.pageIndex) {
				this.pageIndex = data
			}
		},
		pageClick : function() {
			console.log('现在在' + this.pageIndex + '页');
		},
		
	},

	computed : {
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

	}
})
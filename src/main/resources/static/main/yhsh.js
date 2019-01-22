new Vue({
	el: '#app',
	data: {
		User_ID: '',			// 用户编号
		User_Login_Name: '',	// 用户名
		start_submitdate: '',	// 开始提交时间
		end_submitdate: '',		// 结束提交时间
		Identity_Audit: -1,		// 身份证审核
		Info_Audit: -1,			// 详细信息审批
		View_Audit: -1,			// 视频审批
		result: '',
		datas: [],
		/*userId: '',
		userName: '',
		identityAudit: '',
		infoAudit: '',
		viewAudit: '',
		submitTime: '',*/
	},
	methods: {
		search: function() {
			 this.$http.get(this.url).then(function(result){
                 this.datas = result.data.userIdentifications;
             },function(){
                 console.log('请求处理失败');
             });
		},
	},
	// 初始化完成,发起请求获取后台数据
	mounted: function () {
	  this.search();
	},
	// 计算url
    computed: {
        url: function () {
            return 'http://localhost:8080/getDatas?'+'User_ID='+this.User_ID+'&User_Login_Name='+this.User_Login_Name
            +'&start_submitdate='+this.start_submitdate+'&end_submitdate='+this.end_submitdate
            +'&Identity_Audit='+this.Identity_Audit+'&Info_Audit='+this.Info_Audit
            +'&View_Audit='+this.View_Audit;
        }
    }
});
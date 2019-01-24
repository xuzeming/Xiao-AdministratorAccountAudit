var a = UrlParm.parm("id");
new Vue({
	el: '#app',
	data: {
		id: a,
		identification: {},
	},
	methods: {
		search: function() {
			 this.$http.get("http://10.1.13.18:8080/getIdentificationInfo.action",{params:{id:a}}).then(function(result){
                 this.identification = result.data;
             },function(){
                 console.log('请求处理失败');
             });
		},
		pass: function(A) {
			this.$http.get("http://10.1.13.18:8080/pass.action",{params:{flag: A , identity: 'identity' , id: this.id}}).then(function(result){
				if('ok'==result.bodyText){
					location.href='http://10.1.13.18:8080/yonghushenhe.html';
				}
			},function(){
				console.log('请求处理失败');
			});
		},
	},
	// 初始化完成,发起请求获取后台数据
	mounted: function () {
	  this.search();
	},
});
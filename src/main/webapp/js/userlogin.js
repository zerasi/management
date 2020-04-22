/**
 * 
 */

var vm = new Vue({
    el:'#login',
    data:{
    	username:null,
    	msg:null,
    	password:null,
    	
    },
    methods:{
    	userlogin:function(){
    		if(this.username==null || this.username==""){
    			this.msg="账号不能为空"
    				return;
    		}else if(this.password==null || this.password==""){
    			this.msg=null;
    			this.msg="密码不能为空"
    				return;
    		}
    		this.msg=null;
    		var options = {username:this.username,password:this.password};
    		this.$http.post('user/login.do',options,{emulateJSON:true}).then(function(res){
    			if(res.body.success){
    				this.msg="登录成功，即将跳转";
    				setTimeout(function(){ 
    					location.href="custindex.html";
    				}, 1500);
    			}else{
    				this.msg="账号或密码错误";
    			}
    			
            },function(res){
                
            });
    	}
    	
	}
});


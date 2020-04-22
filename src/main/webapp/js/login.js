/**
 * 
 */

var vm = new Vue({
    el:'#login',
    data:{
    	username:null,
    	msg:null,
    	password:null,
    	style1:{'float': 'left','color': '#1ab394'},
    	style2:{'float': 'left', 'margin-left': '60px'},
    	flag:0,
    	
    },
    methods:{
    	reset:function(){
    		this.username=null;
    		this.password=null;
    		this.msg =null;
    	},
    	yonghu:function(){
    		this.reset();
    		this.style1 = {'float': 'left','color': '#1ab394','cursor': 'pointer'};
    		this.style2 ={'float': 'left', 'margin-left': '60px','cursor': 'pointer'};
    		this.flag=0;
    	},
    	guanli:function(){
    		this.reset();
    		this.style1 = {'float': 'left','cursor': 'pointer'};
    		this.style2 ={'float': 'left', 'margin-left': '60px','color': '#1ab394','cursor': 'pointer'};
    		this.flag=1;
    	},
    	
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
    	},
    	
	}
});


//登陆功能
function login(){
	//获取请求参数
	var name=$("#name").val().trim();
	var pwd=$("#pwd").val().trim();
	//检查格式
	var flag=true;
	if(name==''){
		alert("用户名不能为空！");
		flag=false;
	}
	if(pwd==''){
		alert("密码不能为空！");
		flag=false;
	}
	if(flag){
		$.ajax({
			url:"user/login.do",
			type:"post",
			data:{"username":name,"password":pwd},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					addCookie("userId",result.data,1);
					window.location.href="userList.html";
				}else{
					alert(result.msg);
				}
			},
			error:function(){
				alert("登陆失败！");
			}
		});
	}
}
//跳转到注册页面
function toRegist(){
	window.location.href="regist.html";
}
//注册用户
function regist(){
	//获取请求参数
	var username=$("#username").val().trim();
	var truename=$("#truename").val().trim();
	var pwd=$("#pwd").val().trim();
	var age=$("#age").val().trim();
	var sex=$("input[name='gendar']:checked").val();
	var tel=$("#tel").val().trim();
	//检查参数格式
	var flag=true;
	if(""==username){
		$("#username_msg").html("用户名不能为空");
		flag=false;
	}
	if(''==truename){
		$("#truename_msg").html("真实姓名不能为空");
		flag=false;
	}
	if(age==''){
		$("#age_msg").html("年龄不能为空");
		flag=false;
	}
	if(''==pwd){
		$("#pwd_msg").html("密码不能为空！");
		flag=false;
	}
	//发送ajax请求
	if(flag){
		$.ajax({
			url:"user/regist.do",
			type:"post",
			data:{"username":username,"truename":truename,
				"password":pwd,"age":age,"sex":sex,"tel":tel},
			dataType:"json",
			success:function(result){
				if(result.status==0){
					alert(result.msg);
					alert(result.data);
					addCookie("userId",result.data,1);
					window.location.href="note1.html";
				}
			},
			error:function(){
				alert("增加用户失败");
			}
		});
	}
}
function updateBasicInfo(){
	//获取请求参数
	var height=$("#stature").val().trim();
	var eduLevel=$("#education").val();
	var maritalStatus=$("#marriage").val();
	var salary=$("#salary").val();
	var province=$("#province").val();
	var city=$("#city").val();
	var hoursing=$("#hourse").val();
	var carStatus=$("#car").val();
	var userId= getCookie("userId");
	alert(userId);
	//检查参数格式
	//发送ajax请求
	$.ajax({
		url:"user/updateBasicInfo.do",
		type:"post",
		data:{"height":height,"eduLevel":eduLevel,"maritalStatus":maritalStatus,
			"salary":salary,"province":province,"city":city, "housing":hoursing, 
			"carStatus":carStatus,"userId":userId},
		dataType:"json",
		success:function(result){
			alert(result.msg);
			window.location.href="note2.html";
		},
		error:function(){
			alert("保存基本信息失败");
		}
	});
}
function updateInnerVoice(){
	//获取请求参数
	var userId= getCookie("userId");
	var innerVoice=$("#note").val().trim();
	//检查参数格式
	//发送ajax请求
	$.ajax({
		url:"user/updateInnerVoice.do",
		type:"post",
		data:{"innerVoice":innerVoice,"userId":userId},
			dataType:"json",
			success:function(result){
				alert(result.msg);
				window.location.href="note3.html";
			},
			error:function(){
				alert("保存内心独白失败");
			}
	});
}
function updateCondition(){
	//获取请求参数
	var height=$("#stature").val();
	var eduLevel=$("#education").val();
	var maritalStatus=$("#marriage").val();
	var province=$("#province").val();
	var city=$("#city").val();
	var userId= getCookie("userId");
	alert(userId);
	//检查参数格式
	//发送ajax请求
	$.ajax({
		url:"user/updateCondition.do",
		type:"post",
		data:{"heightCon":height,"eduCon":eduLevel,"maritalCon":maritalStatus,
			"provinceCon":province,"cityCon":city,"userId":userId},
		dataType:"json",
		success:function(result){
			alert(result.msg);
			window.location.href="registSuccess.html";
		},
		error:function(){
			alert("保存择友条件失败");
		}
	});
}
//加载用户列表
function loadUserList(){
	//1.发送Ajax请求加载用户列表
	$.ajax({
		url:"user/findAll.do",
		type:"post",
		dataType:"json",
		success:function(result){
			if(result.status==0){
				var users = result.data;
				//循环集合
				for(var i=0;i<users.length;i++){
					var userId = users[i].userId;
					var username = users[i].username;
					var sex=users[i].sex=='m'?'男':'女';
					var age=users[i].age;
					createUserLi(userId,username,sex,age);
				}
			}
		},
		error:function(){
			alert("加载用户列表失败");
		}
	});
};
//创建一个笔记本li元素
function createUserLi(userId,username,sex,age){
	var sli = "";
//	<tr class="row1">
//	<td>1</td>
//	<td>zs</td>
//	<td>男</td>
//	<td>22</td>
//	<td><a href="userDetail.html">详细</a></td>
//</tr>
	sli+='<tr class="row1">';
	sli+='  <td>'+userId+'</td>';
	sli+='  <td>'+username+'</td>';
	sli+='  <td>'+sex+'</td>';
	sli+='  <td>'+age+'</td>';
	sli+='  <td><a href="userDetail.html">详细</a></td>';
    sli+='</tr>';
   var $li = $(sli);//将sli字符串转成jQuery对象li元素
   $li.data("userId",userId);//将值与jQuery对象元素绑定
	//将li元素添加到笔记本ul列表区
   $("#t1").append($li);
};
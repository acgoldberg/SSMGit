$(document).ready(function() {
	$("#input1").click(function() {
		var username = $(".username").val();
		var password = $(".password").val();
		if(username == password) {
			$(".form1").submit();
		}
		else{
			alert("用户名和密码不一致");
		}
	});
	$(".btn").click(function() {
		alert("btn");
	});

})
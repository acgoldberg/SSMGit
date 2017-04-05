$(document).ready(function() {
	var num=0;
	$("#btn1").click(function() {
		alert("#btn1 click");
		var url = this.href;
		var args = {};
		var id = null;
		var name = null;
		var pass = null;
		$.post(url, args, function(data) {
			alert("data.length="+data.length);
			for (var i = 0; i < data.length; i++) {
				 id = data[i].id;
				 name = data[i].username;
				 pass = data[i].password;
				 $(".table1").append("<tr><td>"+id+"</td><td>"+name+"</td><td>"+pass+"</td></tr>");
			}
		});
		return false;
	});
	$("#btn2").click(function() {
		var url = this.href;
		var args = {};
		var id = null;
		var name = null;
		var pass = null;
		var length= null;
		var replacement_cost= null;
		var special_features =special_features;
		$("#table1").empty();
		$("#table1").append("<tr><td><td>title<td>description<td>drelease_year<td>length<td>replacement_cost<td>special_features</tr>");
		$.post(url, args, function(data) {
			for (var i = 0; i < data.length; i++) {
				 id = data[i].title;
				 name = data[i].description;
				 pass = data[i].release_year;
				 length = data[i].length;
				 replacement_cost = data[i].replacement_cost;
				 special_features = data[i].special_features;
				 // $("#table1").append("<tr><td>"+id+"</td><td>"+name+"</td><td>"+pass+"</td><td>"+length+"</td></tr>");
				 $("#table1").append("<tr><td>"+id+"<td>"+name+"<td>"+pass+"<td>"+length+"<td>"+replacement_cost+"<td>"+special_features);
			}
		});
		return false;
	});
	$("#btn3").click(function() {
		var url = this.href;
		var args = {};
		var first_name = null;
		var lastName = null;
		var email = null;
		var addressId= null;
		var lastupdate = null;
		$("#table1").empty();
		$("#table1").append("<tr><td>操作<td>id<td>first_name<td>last_name<td>email<td>address_id<td>last_update</tr>");
		$.post(url, args, function(data) {
			for (var i = 0; i < data.length; i++) {
				id = data[i].customer_id;
				first_name = data[i].first_name;
				lastName = data[i].last_name;
				email = data[i].email;
				address_id = data[i].address_id;
				last_update = data[i].last_update;
				$("#table1").append("<tr><td><a href='#'>编辑</a><a href='#'>删除</a><td>"+id+"<td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
				// $("#table1").append("<tr><td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
			}
			/* $("#table1").append("<a href='select4' id='btn4'>尾页</a>"); */
		});
		return false;
	});
	
	$("#btn4").click(function() {
		var url = this.href;
		var args = {};
		var id = null;
		var name = null;
		var pass = null;
		var length= null;
		var replacement_cost= null;
		var special_features =special_features;
		$("#table1").empty();
		$("#table1").append("<tr><td>id<td>firstName<td>last_name<td>email<td>addressId<td>last_update</tr>");
		$.post(url, args, function(data) {
			for (var i = 0; i < data.length; i++) {
				id = data[i].customer_id;
				first_name = data[i].first_name;
				lastName = data[i].last_name;
				email = data[i].email;
				address_id = data[i].address_id;
				last_update = data[i].last_update;
				 $("#table1").append("<tr><td>name='"+id+"'"+id+"<td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
			}
		});
		return false;
	});
	
	$("#b").click(function() {
		var address = null;
		$.post("selectalladdress", {}, function(data) {
			for (var i = 0; i < data.length; i++) {
				address = data[i].address;
				$(".address_id").append("<option>"+address);
			}
		});
		return false;
	});
	
	$("#before").click(function() {
		var url = this.href;
		if(num>1){
			num--;
			var args = {id:num};
			$("#table1").empty();
			$("#table1").append("<tr><th>操作<th>id<th>firstName<th>last_name<th>email<th>address<th>last_update</tr>");
			//$("#table1").append("<tr><td>id<td>firstName<td>last_name<td>email<td>addressId<td>last_update</tr>");
			$.post(url, args, function(data) {
				for (var i = 0; i < data.length; i++) {
					id = data[i].customer_id;
					first_name = data[i].first_name;
					lastName = data[i].last_name;
					email = data[i].email;
					address_id = data[i].address.address;
					last_update = data[i].last_update;
					 $("#table1").append("<tr><td><a href='selectbyid' name='"+id+"'>编辑</a> <a href='delete'>删除</a><td>"+id+"<td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
				}
			});
		}
		return false;
	});
	
	$("#next").click(function() {
		var url = this.href;
		num++;
		var args = {id:num};
		$("#table1").empty();
		$("#table1").append("<tr><th>操作<th>firstName<th>last_name<th>email<th>address<th>last_update</tr>");
		//$("#table1").append("<tr><th>操作<th>id<th>firstName<th>last_name<th>email<th>address<th>last_update</tr>");
		$.post(url, args, function(data) {
			for (var i = 0; i < data.length; i++) {
				id = data[i].customer_id;
				first_name = data[i].first_name;
				lastName = data[i].last_name;
				email = data[i].email;
				address_id = data[i].address.address;
				last_update = data[i].last_update;
				$("#table1").append("<tr><td><a class='edit1' href='editselect' name='"+id+"'>编辑&nbsp|</a><a class='delete' href='delete' name='"+id+"'>&nbsp删除</a><td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
				//$("#table1").append("<tr><td><a class='edit1' href='editselect' name='"+id+"'>编辑&nbsp|</a><a class='delete' href='delete' name='"+id+"'>&nbsp删除</a><td>"+id+"<td>"+first_name+"<td>"+lastName+"<td>"+email+"<td>"+address_id+"<td>"+last_update);
			}
			$("td .delete").click(function(){
				var i = $(this).prop("name");
				var url = this.href;
				var args = {j:i};
				if(confirm("确认要删除？")){ 
					$.post(url, args, function(data) {});
				}
				else{
					return false;
				}
			});
			$.post("selectalladdress", {}, function(data) {
				for (var i = 0; i < data.length; i++) {
					address = data[i].address;
					$(".address_id").append("<option>"+address);
				}
			});
			$("td .edit1").click(function(){
				var k = $(this).prop("name");
				var url = this.href;
				var args = {l:k};
				$(".edit").css("display","block");
				//获取所有address
				$.post(url, args, function(data) {
					id = data[0].customer_id;
					first_name = data[0].first_name;
					last_name = data[0].last_name;
					email = data[0].email;
					address_id = data[0].address.address;
					$(".id").val(id);
					$(".firstName").val(first_name);
					$(".last_name").val(last_name);
					$(".email").val(email);
					 $("select").val(address_id);
				});
				return false;
			});
		});
		return false;
	});
	
	//alert(status=='login'?true:false);
/*	if(status !=null){
		alert(status);
		 location.href='index.jsp';
	}*/
})
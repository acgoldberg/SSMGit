$(document).ready(function() {
	$(".address_id").append("<option>请选择");
	$.post("selectalladdress", {}, function(data) {
		for (var i = 0; i < data.length; i++) {
			address = data[i].address;
			$(".address_id").append("<option>"+address);
		}
	});
})
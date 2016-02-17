$(function(){
	
	$('#btnVolver').on('click', function(){
		var url="../menu/";
		window.location.href = url;
	});
	
	$('#RsmATable').DataTable();
});
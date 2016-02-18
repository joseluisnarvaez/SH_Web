$(function(){
	$('#RCDTable').DataTable();
	
	$('#volver').on('click',function (){
		var url =  "../ResumenCC";
		 window.location = url;
		
	});
});
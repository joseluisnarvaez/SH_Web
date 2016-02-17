$(function() {
	var url =  "../../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	$('#RsmATable').DataTable();
	
	$('#btnVolver').on('click', function(){
		url="../RevisarArch"
		window.location.href=url;
	})
});
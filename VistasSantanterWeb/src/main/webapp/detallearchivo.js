$(function() {
	var url =  "../../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	$('#DATable').DataTable();
});
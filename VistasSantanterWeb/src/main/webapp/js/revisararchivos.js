$(function() {


	var url =  "../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	
	var url =  "../Bitacora/GetAll";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		armartabla();

	});
	$('#RevATable').DataTable();
	
	
	
	function armartabla() {	
		var list="";
		$.each(dattabla, function(index, value) {
			list += "<tr>";
			list += "<td> <input type='radio' name='check' value='"+value.CCCExt_ID+"'></td>";
			list += "<td ></td>";
			list += "<td >"+value.CCCExt_Nom_Arch_Orig+ "</td>";
			list += "<td >"+value.CCCExt_Fecha_Carga+ "</td>";
			list += "<td>" + value.Hora_Carga + "</td>";
			list += "<td>" + value.CCCExt_CantReg_Infor + "</td>";
			list += "<td>" + value.CCCExt_MontoPagado_Info + "</td>";

			

			
			list += "</tr>";
		});

		$("#RevATable").find('tbody').html(list);	
	}
	
	
	$("#btnRevisarDA").click(function () {	 
		var id=$('input:radio[name=check]:checked').val()
		if(id>0){
			var url =  "../menu/ResumenArch/detalle?id="+id;
			 window.location = url;
		}
		else{
			alert('Debe seleccionar un archivo');
		}
		
		});
	
	$('#volver').on('click',function (){
		var url =  "../menu/";
		 window.location = url;
		
	});
	
	
});
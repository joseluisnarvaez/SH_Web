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

		$("#tablaCC").find('tbody').html(list);	
	}
	
	
	$("#Ver").click(function () {	 
		var id=$('input:radio[name=check]:checked').val()
		if(id>0){
			alert(id);	
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
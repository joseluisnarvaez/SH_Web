$(function() {

	/*confirmar que se usa el campo sponsor para esta vista (revisarArchivos)*/
	var url =  "../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	/*obtiene datos guardados en bitacora y los carga mediante metodo armartabla()*/
	var url =  "../Bitacora/GetAll";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		armartabla();

	});
	
	$('#RevTable').DataTable();
	
	
	
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
	
	/*redireccion de boton revisar validado*/
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
	/*redireccionamiento sin validacion*/
	
	$('#ver').on('click', function(){
		url = "RevisarArch/detalle";
		window.location.href= url;
	});
	
	$('#volver').on('click',function (){
		var url =  "../menu/";
		 window.location = url;
		
	});
	
	
});
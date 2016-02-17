$(function() {
	var RUT=getParameterByName("rut");
	var tipodoc=getParameterByName("tipodoc");
	var polcom= getParameterByName("polcom");
	var itemcia=  getParameterByName("itemcia");
	var numsoli=  getParameterByName("numsoli");
	
	var url =  "CCorrientes/detalle?rut="+RUT+"&tipodoc="+tipodoc+"&polcom="+polcom+"&itemcia="+itemcia+"&numsoli="+numsoli;
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		armartabla();

	});

	
	function armartabla() {	
		var list="";
		$.each(dattabla, function(index, value) {
			list += "<tr>";
			list += "<td >"+value.CCCExt_RutSponsor+ "</td>";
			list += "<td>" + value.CCCExt_DV_RutSponsor + "</td>";
			list += "<td>" + value.CCCExt_Cod_Tipo + "</td>";
			list += "<td>" + value.CCCExt_Nro_Solicitud + "</td>";
			list += "<td>" + value.CCCExt_PolizaCia + "</td>";
//			list += "<td><a target='_blank' href='CCorrientes/getdetalle?rut="+value.CCCExt_RutSponsor+"&tipodoc="+ value.CCCExt_Cod_Tipo+"&polcom="+value.CCCExt_PolizaCia+"&itemcia="+value.CCCExt_ItemCia +"'>" + value.CCCExt_ItemCia + "</a></td>";
			list += "<td>" + value.CCCExt_ItemCia_Ext + "</td>";
			list += "<td>" + value.CCCExt_PolizaCia + "</td>";
			list += "<td>" + value.CCCExt_ItemCia + "</td>";
			list += "<td>" + value.CCCExt_EndosoCia + "</td>";
			list += "<td>" + value.CCCExt_Prima_Debe_MO + "</td>";
			list += "<td>" + value.CCCExt_Prima_Haber_MO + "</td>";
			list += "<td>" + value.CCCExt_Prima_Debe_MP + "</td>";
			list += "<td>" + value.CCCExt_Prima_Haber_MP + "</td>";
			list += "<td>" + value.CCCExt_Dif_Cambio + "</td>";
			list += "<td>" + value.CCCExt_MontoPagado + "</td>";
			list += "<td>" + value.CCCExt_Rut_Cliente + "</td>";
			list += "<td>" + value.CCCExt_DV_RutCliente + "</td>";
			list += "<td>" + value.CCCExt_Periodo_Pago + "</td>";
			list += "<td>" + value.CCCExt_CodEstado_Registro + "</td>";
			
			list += "</tr>";
		});

		$("#detalletab").find('tbody').html(list);
		$('#detalletab').DataTable();
	}
	$('#Cerrar').on('click',function (){
		window.close();
	});
	
	
	$('#CCA1').on('click',function (){
	
		
		var rut=$("#RUTS").val();
		var ICE=$("#ICE").val();
		var periodo=$("#periodo").val();

		var url =  "CCorrientes/filtro?rut="+rut+"&ICE="+ICE+"&periodo="+periodo;
		
		$.getJSON(url).done(function(dat) {
			window.dattabla = dat;

			armartabla();

		});
	});
	
	
	
	
	
	
	
	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}
	
});
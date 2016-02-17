$(function() {
	
	
	
	$('#buscar').on('click',function (){
		var codigo=$("#rut").val();
		var url =  "CCorrientes/getcuentas?rut="+codigo;
		
		$.getJSON(url).done(function(dat) {
			window.dattabla = dat;

			armartabla();

		});
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
			list += "<td><a target='_blank' href='CCorrientes/getdetalle?rut="+value.CCCExt_RutSponsor+"&tipodoc="+ value.CCCExt_Cod_Tipo+"&polcom="+value.CCCExt_PolizaCia+"&itemcia="+value.CCCExt_ItemCia +"&numsoli="+value.CCCExt_Nro_Solicitud+"'>" + value.CCCExt_ItemCia + "</a></td>";
//			list += "<td>" + value.CCCExt_ItemCia + "</td>";
			list += "<td>" + value.CCCExt_EndosoCia + "</td>";
			list += "<td>" + value.CCCExt_Prima_Debe + "</td>";
			list += "<td>" + value.CCCExt_Prima_Haber + "</td>";
			list += "<td>" + value.CCCExt_MonedaOrigen + "</td>";			
			list += "<td>" + value.CCCExt_Prima_Debe_MP + "</td>";
			list += "<td>" + value.CCCExt_Prima_Haber_MP + "</td>";
			list += "<td>" + value.CCCExt_Dif_Cambio + "</td>";
			list += "<td>" + value.CCCExt_Monto_Pagado + "</td>";
			list += "<td>" + value.CCCExt_Tkt_Oficina + "</td>";
			list += "<td>" + value.CCCExt_Tkt_Ano + "</td>";
			list += "<td>" + value.CCCExt_Tkt_Mes + "</td>";
			list += "<td>" + value.CCCExt_Tkt_Concepto + "</td>";
			list += "<td>" + value.CCCExt_Tkt_Correlativo + "</td>";
			list += "<td>" + value.CCCExt_ComPago_Oficina + "</td>";
			list += "<td>" + value.CCCExt_ComPago_Ano + "</td>";
			list += "<td>" + value.CCCExt_ComPago_Mes+ "</td>";
			list += "<td>" + value.CCCExt_ComPago_Concepto+ "</td>";
			list += "<td>" + value.CCCExt_ComPago_Correlativo+ "</td>";
			
			list += "</tr>";
		});

		$("#tablaCC").find('tbody').html(list);
	}
	
	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}
	
	$("#volver").on("click",function() {
	    event.preventDefault();
	    history.back(1);
	});
});
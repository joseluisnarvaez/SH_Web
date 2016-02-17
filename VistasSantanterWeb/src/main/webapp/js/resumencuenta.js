$(function() {
	

	var url =  "../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	
	
	var url =  "../CCorrientes/getcuentas";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		armartabla();

	});
	
	
	function armartabla() {	
		var list="";
		$.each(dattabla, function(index, value) {
			list += "<tr>";
			list += "<td>" + value.CCCExt_Nro_Solicitud + "</td>";
			list += "<td>" + value.CCCExt_Nro_Solicitud + "</td>";			
			list += "<td>" + value.CCCExt_Periodo + "</td>";
			list += "<td>" +value.CCCExt_PolizaCia+"/"+value.CCCExt_ItemCia+"/"+ value.CCCExt_EndosoCia + "</td>";
			list += "<td>" + value.CCCExt_Prima_Debe + "</td>";
			list += "<td>" + value.CCCExt_Prima_Haber + "</td>";
			list += "<td>" + value.CCCExt_MonedaOrigen + "</td>";			
			list += "<td>" + value.CCCExt_Prima_Debe_MP + "</td>";
//			list += "<td>" + value.CCCExt_Prima_Haber_MP + "</td>";
//			list += "<td>" + value.CCCExt_Dif_Cambio + "</td>";
//			list += "<td>" + value.CCCExt_Monto_Pagado + "</td>";
//			list += "<td>" + value.CCCExt_Tkt_Oficina + "</td>";
//			list += "<td>" + value.CCCExt_Tkt_Ano + "</td>";
//			list += "<td>" + value.CCCExt_Tkt_Mes + "</td>";
//			list += "<td>" + value.CCCExt_Tkt_Concepto + "</td>";
//			list += "<td>" + value.CCCExt_Tkt_Correlativo + "</td>";
//			list += "<td>" + value.CCCExt_ComPago_Oficina + "</td>";
//			list += "<td>" + value.CCCExt_ComPago_Ano + "</td>";
//			list += "<td>" + value.CCCExt_ComPago_Mes+ "</td>";
//			list += "<td>" + value.CCCExt_ComPago_Concepto+ "</td>";
//			list += "<td>" + value.CCCExt_ComPago_Correlativo+ "</td>";
			
			list += "</tr>";
		});

		$("#RATable").find('tbody').html(list);
		$('#RATable').DataTable();
	}
	
	
});
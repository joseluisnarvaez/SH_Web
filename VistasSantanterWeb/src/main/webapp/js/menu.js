$(function() {
	$("#recaudacion").hide();
	$("#Corriente").hide();
	$("#tabla_CC").hide();
	$("#Volver").hide();
	
	var url =  "../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		$("#RUTS").val(dat);
		$("#RUTSC").val(dat);
	});
	
	
	$('#boton1').on('click',function (){
		$( "#recaudacion" ).show( );
		$("#Corriente").hide();
		$("#tabla_CC").hide();
		$("#boton2").hide();
		$("#Volver").show();
	});
	$('#Volver').on('click',function (){
		$("#boton2").show();
		$("#boton1").show();
		$("#recaudacion").hide();
		$("#Corriente").hide();
		$("#tabla_CC").hide();
		$("#Volver").hide();
	});
	$('#Volver1').on('click',function (){
		$("#boton2").show();
		$("#boton1").show();
		$("#recaudacion").hide();
		$("#Corriente").hide();
		$("#tabla_CC").hide();
		$("#Volver").hide();
	});
	$('#boton2').on('click',function (){
		$( "#Corriente" ).show( );
		$("#recaudacion").hide();
		$("#boton1").hide();
		$("#Volver").show();
	});
	$('#CCA').on('click',function (){
		$( "#tabla_CC" ).show( );
		

		var periodoC=$("#periodoC").val();

		
		var url =  "../CCorrientes/getcuentas?periodo="+periodoC;
		
		$.getJSON(url).done(function(dat) {
			window.dattabla = dat;

			armartablaCCA();

		});
		
	});
	
	$('#CCA1').on('click',function (){
		$( "#tabla_CC" ).show( );
		

		var periodoC=$("#periodoC").val();

		
		var url =  "../CCorrientes/getcuentas?periodo="+periodoC;
		
		$.getJSON(url).done(function(dat) {
			window.dattabla = dat;

			armartablaCCA();

		});
		
	});
	
	function armartablaCCA() {	
		var list="";
		var Prima_debe=0;
		var Prima_Haber=0;
		$.each(dattabla, function(index, value) {
			list += "<tr>";
			list += "<td >"+value.CCCExt_RutSponsor+ "</td>";
			list += "<td>" + value.CCCExt_DV_RutSponsor + "</td>";
			list += "<td>" + value.CCCExt_Cod_Tipo + "</td>";
			list += "<td>" + value.CCCExt_Nro_Solicitud + "</td>";
			list += "<td>" + value.CCCExt_PolizaCia + "</td>";
			list += "<td><a target='_blank' href='../CCorrientes/getdetalle?rut="+value.CCCExt_RutSponsor+"&tipodoc="+ value.CCCExt_Cod_Tipo+"&polcom="+value.CCCExt_PolizaCia+"&itemcia="+value.CCCExt_ItemCia +"&numsoli="+value.CCCExt_Nro_Solicitud+"'>" + value.CCCExt_ItemCia + "</a></td>";
			list += "<td>" + value.CCCExt_Periodo + "</td>";
			list += "<td>" + value.CCCExt_EndosoCia + "</td>";
			list += "<td>" + value.CCCExt_Prima_Debe + "</td>";
			Prima_debe+=parseFloat(value.CCCExt_Prima_Debe);
			list += "<td>" + value.CCCExt_Prima_Haber + "</td>";
			Prima_Haber+=parseFloat(value.CCCExt_Prima_Haber );
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
		$('#tablaCC').DataTable();
		
		list= "<tr><td>" +Prima_debe+"<td>" +Prima_Haber+
				"</td>"+
				"</td></tr>";
//		$("#TotalCC").find('tbody').html(list);
		
	}
	
});
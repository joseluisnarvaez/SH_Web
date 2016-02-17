$(function() {
	$('#RCTable').DataTable();



/*carga campo rut*/

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
			list += "</tr>";
		});

		$("#RCTable").find('tbody').html(list);
		$('#RCTable').DataTable();
	}
	
	
	
/*#######################################*/	
/*funcion animacion selecto tipo movimiento*/
function habilitar(value)
{
	/*Funcion habilita radioButton*/
	if(document.getElementById("selectTipoMovtoCC").value=="recaudacion"){
		document.getElementById("col-hideControls").style.visibility="visible";
		document.getElementById("col-hideControls").style.opacity="1"; /*fix for safari*/
		document.getElementById("radioComprobanteCC").disabled=false;
		document.getElementById("radioTicketCC").disabled=false;
	}else{
		document.getElementById("campoTicketCC").value="";
		document.getElementById("campoComprobanteCC").value="";
		document.getElementById("campoTicketCC").disabled=true;
		document.getElementById("campoComprobanteCC").disabled=true;
		document.getElementById("radioTicketCC").disabled=true;
		document.getElementById("radioComprobanteCC").disabled=true;
		document.getElementById("radioTicketCC").value.checked=false;
		document.getElementById("radioComprobanteCC").value.checked=false;
	}	


	if(value=="radioTicketCC"){
		// habilita campo ticket si su radio button es seleccionado
		document.getElementById("campoTicketCC").disabled=false;
		document.getElementById("campoComprobanteCC").disabled=true;
	}else if(value=="radioComprobanteCC"){
		// habilita campo comrpobante si su radio button es seleccionado
		document.getElementById("campoComprobanteCC").disabled=false;
		document.getElementById("campoTicketCC").disabled=true;
	}

}
$(function() {
	
	

	var url =  "../movimientos/find";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;
		var list= "<option value='0'></option>";
		$.each(dat , function(j,i){
			 list+= "<option value='"+j+"'>"+i+"</option>";
			
		} );
			
		 $("#selectMovimientos").html(list);  

	});
	

	var url =  "../Sponsor/getrut";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		$("#sponsortext").val(dat);

	});
	
	var url =  "../Bitacora/GetInfo";
	
	$.getJSON(url).done(function(dat) {
		window.dattabla = dat;

		armartabla();

	});

	
	
	
	function armartabla() {	
		var list="";
		$.each(dattabla, function(index, value) {
			list += "<tr>";
			list += "<td> <input type='checkbox'name='check' value='"+value.CCCExt_ID+"'></td>";
			list += "<td >"+value.Desc_Tipo+ "</td>";
			list += "<td >"+value.CCCExt_Nom_Arch_Orig+ "</td>";
			list += "<td >"+value.CCCExt_Fecha_Carga+ "</td>";
			list += "<td>" + value.Hora_Carga + "</td>";
			list += "<td>" + value.CCCExt_CantReg_Infor + "</td>";
			list += "<td>" + value.CCCExt_MontoPagado_Info + "</td>";

			

			
			list += "</tr>";
		});

		$("#tablaCC").find('tbody').html(list);	
	}
	
	
	$('#confirmar').on('click',function (){
		var i=0;
		$('input[name="check"]:checked').each(function() {
			var id=$(this).val(); 
			var url =  "../Bitacora/Updateregistro?ID="+id+"&cod="+4;
			
			$.getJSON(url).done(function(dat) {
				

			
			});
		i=1;
		});
		if(i==1){
			alert('Registros actualizados con exito');
			location.reload();	
		}
		else{
			alert('No hay regristros que Actualizar');
		}
		
	});
	
	
	$('#rechazar').on('click',function (){
		var i=0;
		$('input[name="check"]:checked').each(function() {
			var id=$(this).val(); 
			var url =  "../Bitacora/Updateregistro?ID="+id+"&cod="+5;
			
			$.getJSON(url).done(function(dat) {
				

			
			});
			i=1;
		});
		if(i==1){
			alert('Registros actualizados con exito');
			location.reload();	
		}
		else{
			alert('No hay regristros que Actualizar');
		}
	});
	
	$('#volver').on('click',function (){
		var url =  "../menu/";
		 window.location = url;
		
	});
	
	

	
});
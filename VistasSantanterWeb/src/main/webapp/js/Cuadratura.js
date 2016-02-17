$(function() {

	/*boton volver*/
	$('#volver').on('click',function (){
		var url =  "../menu/";
		 window.location = url;
		
	});
	
	/*boton confirmar*/
	
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
	
	/*boton rechazar*/
	
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
	
	
	/*funcion que arma la tabla*/
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
	

	
});
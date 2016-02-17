$(function() {
var cod=getParameterByName("cod");
	
	
	
	$("#Sponsor").hide();
	$("#comentario").html("Sistema Cta. Cte. Hipotecario - Sponsor");

	$('#login').on('click',function (){
		var pass=$("#pass").val();
		var user=$("#user").val();
		var url =  "login?user="+user+"&pass="+pass;
		
		$.getJSON(url).done(function(dat) {
			
			if(dat!=false){
				
				$("#Divlogin").hide();
				$("#comentario").html("Seleccion de Sponsor");
				$( "#Sponsor" ).show(  );
				var url =  "Sponsor/find?user="+dat;
				
				$.getJSON(url).done(function(dat) {
					var list= "<option value='0'></option>";
					$.each(dat , function(i,j){
						 list+= "<option value='"+i+"'>"+j+"</option>";
						
					} );
					
					 $("#selectSponsor").html(list);  

				});
				
				
			}
			else{
				alert('Usuario o Clave fue mal ingresada');
			}

			

		});
	});
	if(cod==1){

		alert('Usuario no tiene permitido el acceso al sistema');
		}
	$('#buscar').on('click',function (){
		
		
		var url =  "menu/";
		var ur =  "setsponsor?Sponsor="+$('select#selectSponsor').val();
		$.getJSON(ur).done(function(dat) {
			
		});
		
		
		 window.location = url;
	});
	
	function getParameterByName(name) {
	    name = name.replace(/[\[]/, "\\[").replace(/[\]]/, "\\]");
	    var regex = new RegExp("[\\?&]" + name + "=([^&#]*)"),
	        results = regex.exec(location.search);
	    return results === null ? "" : decodeURIComponent(results[1].replace(/\+/g, " "));
	}
});
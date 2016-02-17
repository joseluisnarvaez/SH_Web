function volver_index(){
	window.location = "index.jsp";
	}
function mostrar_detalle(rut){
	window.location = "mostrar_detalle.jsp?RutSponsor="+rut;
	}
function volver_buscar(){
	window.location = "buscar.jsp";
	}
function isNumber(e) {
	k = (document.all) ? e.keyCode : e.which;
	if (k==8 || k==0) return true;
	patron = /([k-l]|[0-9]|[K-L])/;
	n = String.fromCharCode(k);
	return patron.test(n);
}

function revisar(){
	var f = document.buscar;
	var rut = f.rut;
	if(rut.value==""){
		alert("Por Favor, Ingrese Rut");
 		rut.focus();
 		return false;}	
	}
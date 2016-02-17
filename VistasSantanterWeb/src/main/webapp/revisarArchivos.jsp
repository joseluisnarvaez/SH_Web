<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Revisar Archivos</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8_spanish_ci">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/index.css">
    
    <!--PLUGIN DATATABLES-->
<<<<<<< HEAD
    <link rel="../../datatables.min.css"/>
	<script src="../../js/datatables.min.js"></script>
	<script src="../../js/revisararchivos.js"> </script>

=======
    
     <script src="../../js/datatables.min.js"></script>
	 <link rel="stylesheet" href="../../css/datatables.min.css">
	 
>>>>>>> 2e7935b7348ef9f593562050aa9263e7a7957aba
	
	<!--FIN DATATABLES-->
	
	<script src="../../js/revisararchivos.js"> </script>
</head>
<body>
	<!--TITULO DE PAGINA Y LOGO-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Revisar Archivos Recepcionados</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>
	
	<!--TABLA REVISAR ARCHIVOS-->
	<div class="container contTableRevA">

		<div class="row rowTableRevA">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="table-responsive">
					<table class="table table-bordered table-hover" id="RevATable"> <!--efecto hover (probando)-->
						<thead class="thead-default">
							<tr class="cabecera">
								<th>Confirmar</th>
								<th>Poliza Compa&ntildeia</th>
								<th>Nombre Archivo</th>
								<th>Fecha Procesado</th>
								<th>Hora Procesado</th>
								<th>Cantidad Registros</th>
								<th>Monto Informado(Pesos)</th>
								<th>Monto (MO)</th>
							</tr>
						</thead>
						<tbody>
<<<<<<< HEAD
=======
							
>>>>>>> 2e7935b7348ef9f593562050aa9263e7a7957aba
							<!--NOTA: Quizas sea buena idea usar la opcion de select de una tabla dinamica para seleccionar uno de los registros arrojados por sistema en reemplazo del radio button-->
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="row rowBtnRevisarDA">
			<div class="col-lg-2 col-lg-offset-4 col-md-2 col-md-offset-4 col-sm-4 col-sm-offset-2 col-xs-6">
				<input type="button" name="btnRevisarDA" id="ver" class="btnRevisarDA btn btn-primary form-control form-control-red2" value="Revisar">
			</div>
			<div class="col-lg-2 col-md-2 col-sm-4 col-xs-6 ">
				<input type="button" name="btnVolverDA" id="volver" class="btnRevisarDA btn btn-danger form-control form-control-red2" value="Volver">
			</div>
			
		</div>
	</div>


</body>
</html>
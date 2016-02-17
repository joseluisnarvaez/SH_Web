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
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,cr-1.3.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.css"/>
	<script type="text/javascript" src="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,cr-1.3.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.js"></script>
	<!--<script src="../js/revisararchivos.js"> </script>-->
	<!--FIN DATATABLES-->
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
					<img src="../img/logo.png" class="logoCelda"alt="">
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
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> <!--IMPORTANTE!: para evitar problemas de seleccion multiple en los radio buttons siempre darle un valor atributo name="" (Ej: opcionradio).-->
									</div>
								</td>
								<td>Poliza 1</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 1</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 2</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 2</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Nombre</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>zavala</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>01-zavala</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Constanza</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Bastian</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Abigail</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 3</td>
							</tr>
							<tr>
								<td>
									<div class="radio">
										<label><input type="radio" name="opcionradio"></label> 
									</div>
								</td>
								<td>Poliza 3</td>
								<td>Alejandra</td>
								<td>Fecha</td>
								<td>Hora</td>
								<td>CantReg</td>
								<td>Monto_Pagado</td>
								<td>MO 14</td>
							</tr>
							<!--NOTA: Quizas sea buena idea usar la opcion de select de una tabla dinamica para seleccionar uno de los registros arrojados por sistema en reemplazo del radio button-->
						</tbody>
					</table>
				</div>
			</div>
		</div>

		<div class="row rowBtnRevisarDA">
			<div class="col-lg-2 col-lg-offset-5 col-md-2 col-md-offset-5 col-sm-4 col-sm-offset-4 col-xs-4 col-xs-offset-4">
				<input type="button" name="btnRevisarDA" id="btnRevisarDA" class="btnRevisarDA btn btn-primary form-control form-control-red2" value="Revisar">
			</div>
		</div>
	</div>


</body>
</html>
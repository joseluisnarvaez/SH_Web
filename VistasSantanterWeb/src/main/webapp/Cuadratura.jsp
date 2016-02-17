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
    <script src="../../js/Cuadratura.js"></script>
</head>
<body>
	<!--TITULO DE PAGINA Y LOGO-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Cuadratura Archivos</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>
	
	<!--TABLA CUADRATURA ARCHIVOS-->
	<div class="container"> <!--contenedor tabla cuadratura archivos-->
		<div class="row">
			<div class="col-xs-12">
				<div class="table-responsive"> <!--clase para table responsive-->
					<table class="table table-bordered"  id="tablaCC">
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
<!-- 							<tr> -->
<!-- 								<td><input type="checkbox" /></td> -->
<!-- 								<td>Poliza 1</td> -->
<!-- 								<td>Nombre</td> -->
<!-- 								<td>Fecha</td> -->
<!-- 								<td>Hora</td> -->
<!-- 								<td>CantReg</td> -->
<!-- 								<td>Monto_Pagado</td> -->
<!-- 								<td>MO 1</td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td><input type="checkbox" /></td> -->
<!-- 								<td>Poliza 2</td> -->
<!-- 								<td>Nombre</td> -->
<!-- 								<td>Fecha</td> -->
<!-- 								<td>Hora</td> -->
<!-- 								<td>CantReg</td> -->
<!-- 								<td>Monto_Pagado</td> -->
<!-- 								<td>MO 2</td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td><input type="checkbox" /></td> -->
<!-- 								<td>Poliza 3</td> -->
<!-- 								<td>Nombre</td> -->
<!-- 								<td>Fecha</td> -->
<!-- 								<td>Hora</td> -->
<!-- 								<td>CantReg</td> -->
<!-- 								<td>Monto_Pagado</td> -->
<!-- 								<td>MO 3</td> -->
<!-- 							</tr> -->
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

	<div class="container contBtnsCuadratura">
		<div class="row">
			<form>
				<!--Nota: Revisar clase btn-responsive - proxima revicion-->
				<div class="col-lg-2 col-lg-offset-3 col-md-2 col-md-offset-3 col-sm-2 col-sm-offset-3 col-xs-6">
					<input type ="button" class="btn btn-primary btn-responsive"name="Confirmar" id="confirmar" value="Confirmar"/>
				</div>
				<div class="col-lg-2 col-md-2 col-sm-2 col-xs-6">
					<input type ="button" class="btn btn-primary" name="Rechazar" id="rechazar" value="Rechazar"/>
				</div>
				<div class="col-lg-2 col-md-2 col-sm-2 ">
					<input type ="button" class="btn btn-danger" name="Volver" id="volver" value="Volver"/>
				</div>
			</form>
		</div>
	</div>
</body>
</html>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Menu Principal</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8_spanish_ci">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/index.css">
    <script src="../../js/MenuPrincipal.js"></script>
</head>
<body>

	<!--Titulo de pagina y logo-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Men&uacute Principal</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>
	
	<!--MENU PINCIPAL-->
	<div class="container contMenuPrincipal">
		<div class="row rowMenuPrincipal">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="col-md-4 col-md-offset-4">
						<input type="button" class="btn btn-default form-control form-control-red2" id="btnCuadraturaArchivos"name="btnCuadraturaArchivos" value="Cuadratura Archivos">
					</div>
					<div class="clearfix visible-lg-block visible-md-block"></div>

					<div class="col-md-4 col-md-offset-4">
						<input type="button" class="btn btn-default form-control form-control-red2" id="btnRevisarArchivos" name="btnRevisarArchivos" value="Revisar Archivos Recepcionados">
					</div>
					<div class="clearfix visible-lg-block visible-md-block"></div>

					<div class="col-md-4 col-md-offset-4 ">
						<input type="button" class="btn btn-default form-control form-control-red2" id="btnConsultarCuenta" name="btnConsultarCuenta" value="Consultar Cuenta Corriente">
					</div>
				</div>
			</div>	
		</div>
	</div>
</body>
</html>
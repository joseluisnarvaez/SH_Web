<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Inicio</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<!--# Scripts #-->
	<script src="../js/jquery.min.js"></script>
	<script src="../js/jquery-1.9.1.js"></script>
	<script src="../js/functions.js"></script>
	<script src="../swal/dist/sweetalert.min.js"></script>
	<script src="../js/login.js"></script>
	<!--# Style Sheets #-->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/index.css">
    

</head>
	<!--Titulo de pagina y logo-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p ="comentario">Sistema Cta. Cte. Hipotecario</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>
	

	<!-- ESTRUCTURA LOGIN -->
	<div class="container contLogin2" id="Divlogin">
		
			<div class="panel panel-default">
				<div class="panel-body">
					<form class="form-signin">
						<div class="row">
							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
								<label for="user">Usuario:</label>
								<input type="text" id="user" class="form-control form-control-red2" placeholder="Usuario" autofocus required="">
							</div>
							<div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
								<label for="pass">Contraseña:</label>
								<input type="password" id="pass" class="form-control form-control-red2" placeholder="Contraseña" required="">
							</div>
						</div>
						<div class="row rowBtnLogin">
							<div class="col-lg-4 col-lg-offset-4 col-md-3 col-md-offset-4">
							<input type="button" id="login" class="btnIngresarLogin btn btn-danger form-control" value ="Ingresar">
								
								<!-- <input type="submit" id="login" class="btnIngresarLogin btn btn-danger form-control" value="Ingresar"> -->
							</div>
						</div>
					</form>
				</div>
			</div>
	</div>	

	<!-- FORMULARIO OCULTRO - VISIBLE TRAS LOGIN--> <!--NOTA: Verificar diseño responsive de los controles-->

	<div id="Sponsor">
	 	<div class="container contSelectSponsor">
			<div class="row">
				<div class="col-lg-4 col-lg-offset-4 col-md-4 col-md-offset-4 col-sm-4 col-sm-offset-4 col-xs-8 col-xs-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<label for="selectSponsor">Sponsor:</label>
							<select name="selectSponsor" id="selectSponsor" class="selectSponsor form-control form-control-red"></select>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container contBtnLogin">
			<div class="row">
				<div class="col-lg-2 col-lg-offset-5 col-md-2 col-md-offset-5 col-sm-2 col-sm-offset-5 col-xs-6 col-xs-offset-3">
					<input type ="button" name="buscar" class="btn btn-primary form-control form-control-red2" value="Buscar" id="buscar"/>
				</div>
			</div>
		</div>
	</div>
			
<body>
	
</body>
</html>
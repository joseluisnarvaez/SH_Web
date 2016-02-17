<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Resumen</title>
	<meta charset="UTF-8">
	<title>Menu Principal</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8_spanish_ci">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../js/jquery-1.9.1.js"></script>
	<script src="../../js/datatables.min.js"></script>
	<script src="../../js/resumencuenta.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/index.css">
    
	<!--DataTables - Tablas dinamicas -->
<!-- 	<script src="../../js/datatables.min.js"></script> -->
<!-- 	<link rel="stylesheet" href="../../css/datatables.min.css"> -->
<!-- <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,af-2.1.1,b-1.1.2,cr-1.3.1,fc-3.2.1,fh-3.1.1,kt-2.1.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.css"/> -->
 
<!-- <script type="text/javascript" src="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,af-2.1.1,b-1.1.2,cr-1.3.1,fc-3.2.1,fh-3.1.1,kt-2.1.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.js"></script> -->

<!-- 		<script src="../../js/JSBUSCAR.js"></script> -->


</head>
<body>
	<div class="container contResumen">
		<div class="row">
			<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
				<p>RESUMEN CUENTA CTE</p>
			</div>
			<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
				<img src="../../img/logo.png" class="logoCelda"alt="">
			</div>
		</div>
	</div>
	<hr class="linea">

	<!--02-Buscar Sponsor-->
	<!--Se activa al iniciar sesion-->
	<div class="container contenedorSponsor">
		<div class="row">
			<div class="col-md-6">
				<div class="subcapaNombreSponsor"> <!--REVISAR ENMARCADO DE NOMBRESPONSOR!!-->
					<table class="tablaNombreSponsor">
					<thead>
						<tr>
							<td class="TDsponsor">Sponsor: </td>
							<td><input type="text" class="form-control form-control-red" id="sponsortext"  readonly="readonly"></td>
						</tr>
					</thead>
				</table>
				</div>
			</div>
			<div class="col-md-6">
				<div class="botonLimpiar pull-right">
					<input type ="button" name="limpiarFiltro" class="btn btn-primary btnLimpiarFiltro" id="btnLimpiarFiltro" value="Limpiar Filtro"/>
				</div>
			</div>
		</div>
	</div>

	<div class="container controlsResumenArchivos">
		<div class="row rowTotales">
			<div class="col-md-7">
				<table>
					<thead>
						<tr>
							<td>Total Debe</td>
							<td><input type="text" class="form-control" id="campoTotalDebe"></td>
							<td>Total Haber</td>
							<td><input type="text" class="form-control" id="campoTotalHaber"></td>
							<td><select ></select></td>
							<td><input type="text" class="form-control" id="campoTotal"></td>
						</tr>
					</thead>
				</table>
			</div>

			<div class="col-md-5">
				<div class="botonLimpiar pull-right">
					<input type ="button" name="cargar" class="btn btn-primary btnAprobar" id="btnCargarTabla" value="Cargar Tabla"/>

					<input type ="button" name="limpiar" class="btn btn-primary btnVolver" id="btnCargarTabla" value="Limpiar Filtro"/>
				</div>
			</div>

		</div>
	</div>



	<!--TABLA RESUMEN ARCHIVOS-->

	<div class="container contenedorTableRA">
	<!--ROW TABLA-->
			<div class="row row-table">
			<table class="table table-bordered " id="RATable">
				<thead>
					<tr class="cabecera">
						<th>Tipo Movto</th>
						<th>Num Movto</th>
						<th>Periodo</th>
						<th>Poliz/Item/Endoso Cia</th>
						<th>Cant. Registros</th>
						<th>Debe</th>
						<th>Haber</th>
						<th>Monto(MO)</th>
					</tr>
				</thead>
				<tbody>
				</tbody>
			</table>
		</div>
	</div>



	<!--CONTENEDOR TOTALES-->
	<div class="container contenedorTotales">
			<div class="rowTotales">
			<table>
				<thead>
					<tr>
						<td>Total Debe</td>
						<td><input type="text" class="form-control" id="campoTotalDebe"></td>
						<td>Total Haber</td>
						<td><input type="text" class="form-control" id="campoTotalHaber"></td>
						<td>Saldo Total</td>
						<td><input type="text" class="form-control" id="campoTotal"></td>
					</tr>
				</thead>
			</table>
		</div>
	</div>

<!-- fin contenedor general-->
</div>
	

</body>
</html>
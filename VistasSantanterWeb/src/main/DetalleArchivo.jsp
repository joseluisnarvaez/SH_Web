<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Resumen Archivos</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8_spanish_ci">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/index.css">

    <!--PLUGIN DATATABLES-->
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,cr-1.3.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.css"/>
	<script type="text/javascript" src="https://cdn.datatables.net/t/bs/jqc-1.12.0,dt-1.10.11,cr-1.3.1,r-2.0.2,rr-1.1.1,sc-1.4.1,se-1.1.2/datatables.min.js"></script>
	<script src="../../js/detallearchivo.js"> </script>

</head>
<body>
	
	<!--HEADER-->
	<div class="container contResumen">
		<div class="row">
			<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
				<p>DETALLE ARCHIVOS</p>
			</div>
			<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
				<img src="../../img/logo.png" class="logoCelda"alt="">
			</div>
		</div>
	</div>
	<hr class="linea">

	<!--CONTAINER GENERAL! -->
	<div class="container contDetalleArchivos">


	<!-- SPONSOR -->

	<div class="container contenedorSponsor">
		<div class="row">
			<div class="col-lg-6 col-md-6 col-sm-12 col-sm-12">
				<div class="subcapaNombreSponsor"> <!--REVISAR ENMARCADO DE NOMBRESPONSOR!!-->
					<table class="tablaNombreSponsor">
					<thead>
						<tr>
							<td class="TDsponsor">Sponsor: </td>
							<td><input type="text" class="form-control form-control-red"></td>
							<td class="TDsponsor">Nombre Archivo: </td>
							<td><input type="text" class="form-control form-control-red"></td>
						</tr>
					</thead>
				</table>
				</div>
			</div>
		</div>
	</div>
<!--CONTROLS RESUMEN ARCHIVOS-->
	<div class="container controlsDetalleArchivos">
		<div class="row rowTotales">
			<div class="col-md-7">
				<table class="tableControls">
					<thead>
						<tr>
							<th>Tipo Movto</th>
							<th>Poliza/Item/Cia</th>
							<th>Endoso Cia</th>
							<th>Poliza/Item/Sponsor</th>
						</tr>
					</thead>
					<tbody>
						<tr>	
							<td class="tdSeparate"><select name="selectTipoMovtoDA" id="selectTipoMovtoRA" class="selectTipoMovtoDA"></select></td>
							<!--
							<td class="tdSeparate"><select name="selectPolizaRA" id="selectPolizaRA" class="selectPolizaRA"></select></td>
							<td class="tdSeparate"><select name="selectEndosoRA" id="selectEndosoRA" class="selectEndosoRA"></select></td>
							-->
							<td class="tdSeparate"><input class="form-control form-control-red" type="text"></td>
							<td class="tdSeparate"><input class="form-control form-control-red" type="text"></td>
							<td class="tdSeparate"><input type="text" class="form-control form-control-red"></select></td>
						</tr>
					</tbody>
				</table>
			</div>

			<div class="col-md-5 pull-down">
				<div class="botonLimpiar pull-right">
					<input type ="button" name="cargar" class="btn btn-primary btnAprobar" id="btnCargarTabla" value="Cargar Tabla"/>

					<input type ="button" name="limpiar" class="btn btn-primary btnVolver" id="btnCargarTabla" value="Limpiar Filtro"/>
				</div>
			</div>

		</div>
	</div>


	<!--TABLA RESUMEN ARCHIVOS-->

	<div class="container contenedorTableDA">
	<!--ROW TABLA-->
			<div class="row row-table">
			<table class="table table-bordered " id="DATable">
				<thead>
					<tr class="cabecera">
						<th>Tipo Movto</th>
						<th>Nยบ Movto</th>
						<th>Periodo</th>
						<th>Poliza/Item/Endoso Cia</th>
						<th>Poliza/Item/ Sponsor</th>
						<th>Rut Cliente</th>
						<th>Debe</th>
						<th>Haber</th>
						<th>Monto(MO)</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
					<tr>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
						<td>Datos Varios - - </td>
					</tr>
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
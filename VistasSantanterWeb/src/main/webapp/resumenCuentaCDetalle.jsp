<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Detalle Cuenta Corriente</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <script src="../../../js/jquery.min.js"></script>
	<script src="../../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../css/index.css">
    <!--PLUGIN DATATABLES-->
    <script src="../../../js/datatables.min.js"></script>
	<link rel="stylesheet" href="../../../css/datatables.min.css">
	<!-- <script src="../../../js/revisararchivos.js"> </script> -->
    <script src="../../../js/resumenccDetalle.js"></script>
	<!--FIN DATATABLES-->
</head>
<body>
	<!--TITULO DE PAGINA Y LOGO-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Revisar Archivos Recepcionados (Rsm)</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6">
					<img src="../../../img/logo.png" class="logoCelda">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>

	<!--CONTENEDOR CONTROLES Y FILTROS-->

	<div class="container contControlsDC">
		<!--FILA CON EL CAMPO NOMBRE DE SPONSOR (READONLY)-->
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row rowCamposDC">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoSponsorDC">Sponsor:</label>
						<input type="text" name="campoSponsorDC" id="campoSponsorDC" class="campoSponsorDC form-control form-control-red2" readonly="readonly">
					</div>	
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoPeriodoDesdeDC">Pago Periodo Desde:</label>
						<input type="datetime-local" name="campoPeriodoDesdeDC" id="campoPeriodoDesdeDC" class="campoPeriodoDesdeDC form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoPeriodoHastaDC">Pago Periodo Hasta:</label>
						<input type="text" name="campoPeriodoHastaDC" id="campoPeriodoHastaDC" class="campoPeriodoHastaDC form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoPolizaItemCiaDC">Poliza/Item/Compañia:</label>
						<input type="text" name="campoPolizaItemCiaDC" id="campoPolizaItemCiaDC" class="campoPolizaItemCiaDC form-control form-control-red2" readonly="readonly">
					</div>
				</div>
				<div class="row">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoPolizaItemSponsorDC">Poliza/Item/Sponsor:</label>
						<input type="text" name="campoPolizaItemSponsorDC" id="campoPolizaItemSponsorDC" class="campoPolizaItemSponsorDC form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoEndosoCiaDC">Endoso Cia:</label>
						<input type="text" name="campoEndosoCiaDC" id="campoEndosoCiaDC" class="campoEndosoCiaDC form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoTipoPrimaDC">Tipo Prima:</label>
						<input type="text" name="campoTipoPrimaDC" id="campoTipoPrimaDC" class="campoTipoPrimaDC form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoEstadosDC">Estados:</label>
						<input type="text" name="campoEstadosDC" id="campoEstadosDC" class="campoEstadosDC form-control form-control-red2" readonly="readonly">
					</div>
				</div>

			</div>
		</div>
			
		<div class="panel panel-default panel-camposCompletar">
			<div class="panel-body">
				<div class="row rowFiltrosDC">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoPeriodoDC">Periodo:</label>
						<input type="text" name="campoPeriodoDC" id="campoPeriodoDC" class="campoPeriodoDC form-control form-control-red2">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoPolizaItemSponsorDC">Poliza/Item/Sponsor:</label>
						<input type="text" name="campoPolizaItemSponsorDC" id="campoPolizaItemSponsorDC" class="campoPolizaItemSponsorDC form-control form-control-red2">
					</div>
					<!--<div class="clearfix visible-xs-block"></div> Probar solucion-->
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">
						<label for="campoRutClienteDC">Rut Cliente</label>
						<input type="text" name="campoRutClienteDC" id="campoRutClienteDC" class="campoRutClienteDC form-control form-control-red2">
					</div>
				</div>
				<div class="row rowBtnBuscarDC">
					<div class="col-lg-2 col-lg-offset-10 col-md-2 col-md-offset-10 col-sm-3 col-sm-offset-9 col-xs-4 col-xs-offset-8 ">
						<label for="btnBuscarDC"></label>
						<input type="button" class="btn btn-primary form-control form-control-red2" id="btnBuscarDC" name="btnBuscarDC" value="Buscar">
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--CONTENEDOR TABLA -->
	<div class="container contTableDC">
		<div class="row">
			<div class="col-xs-12">
				<div class="table-responsive">
					<table class="table table-bordered" id="RCDTable">
						<thead>
							<tr class="cabecera">
								<th>Tipo Movimiento</th>
								<th>Numero Solicitud</th>
								<th>Fecha Movimiento</th>
								<th>Fecha Ingreso</th>
								<th>Estado Movimiento</th>
								<th>Poliza/Item/Sponsor</th>
								<th>Fecha Inicio Vig.</th>
								<th>Debe</th>
								<th>Haber</th>
								<th>Saldo</th>
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
								<td>Datos Varios - - </td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container contTotalesDC">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row rowTotalesDC">
					<div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
						<label for="campoTotalDebeRsmA">Total Debe</label>
						<input type="text" class="form-control form-control-red2" readonly="readonly" id="campoTotalDebeRsmA">
					</div>
					<div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
						<label for="campoTotalHaberRsmA">Total Haber</label>
						<input type="text" class="form-control form-control-red2" readonly="readonly" id="campoTotalHaberRsmA">
					</div>
					<div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
						<label for="campoTotalRsmA">Total</label>
						<input type="text" class="form-control form-control-red2" readonly="readonly" id="campoTotalRsmA">
					</div>
				</div>
				
			</div>
		</div>
		<div class="row rowBtnVolverDC">
			<div class="col-lg-2 col-lg-offset-10 col-md-2 col-md-offset-10 col-sm-4 col-sm-offset-8 col-xs-6 col-xs-offset-6 ">
				<input type="button" name="btnVolverDA" id="volver" class="btnRevisarDA btn btn-danger form-control form-control-red2" value="Volver">
			</div>
		</div>
	</div>
	

</body>
</html>
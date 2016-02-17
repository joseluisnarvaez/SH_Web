<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Resumen Archivos</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8_spanish_ci">
    <script src="../../../js/jquery.min.js"></script>
	<script src="../../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../../css/index.css">
    <!--PLUGIN DATATABLES-->
      
     <script src="../../../js/datatables.min.js"></script>
	 <link rel="stylesheet" href="../../css/datatables.min.css">
	<script src="../../../js/detallearchivo.js"> </script>
	<!-- <script src="../../js/resumenarchivos.js"></script> -->
	
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
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>

	<!-- SET DE CAMPOS REVISAR ARCHIVOS RECEPCIONADOS (RSM)-->
<!-- 	<div class="container contCamposRsmA"> -->
<!-- 		<!--CAMPO SPONSOR-->
<!-- 		<div class="row"> -->
<!-- 			<div class="col-lg-3 col-md-3 col-sm-4 col-xs-12"> -->
<!-- 				<div class="panel panel-default"> -->
<!-- 					<div class="panel-body"> -->
<!-- 						<label for="campoSponsorRsmA">Sponsor: </label> -->
<!-- 						<input type="text" class="campoSponsorRsmA form-control form-control-red2" id="sponsortext" readonly="readonly"> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->

	<div class="container contCamposDA">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row rowCampoSponsorDA">
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoSponsorDA">Sponsor: </label>
						<input type="text" class="campoSponsorDA form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-3 col-md-3 col-sm-6 col-xs-6">
						<label for="campoNombreDA">Nombre Archivo: </label>
						<input type="text" class="campoNombreDA form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-2 col-md-2  col-sm-4 col-xs-12">
						<label for="campoPolizaItemEndosoCiaDA">Pol./Item/End. Cia: </label>
						<input type="text" class="campoPeriodoDA form-control form-control-red2" id="campoPolizaItemEndosoCiaDA" readonly="readonly">
					</div>
					<div class="col-lg-2 col-md-2  col-sm-4 col-xs-6">
						<label for="campoTipoMovtoDA">Tipo Movto: </label>
						<input type="text" class="campoTipoMovtoDA form-control form-control-red2" readonly="readonly">
					</div>
					<div class="col-lg-2 col-md-2 col-sm-4 col-xs-6">
						<label for="campoNoMovtoDA">No Movto: </label>
						<input type="text" class="campoNoMovtoDA form-control form-control-red2" readonly="readonly">
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row rowCamposDA">
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
						<label for="campoPolizaItemSponsorDA">Pol./Item/Sponsor: </label>
						<input type="text" class="campoPeriodoDA form-control form-control-red2">
					</div>
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
						<label for="campoRutClienteDA">Rut Cliente: </label>
						<input type="text" class="campoPeriodoDA form-control form-control-red2">
					</div>
					<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
						<label for="campoPeriodoDA">Periodo: </label>
						<input type="text" class="campoPeriodoDA form-control form-control-red2">
					</div>
					<div class="col-lg-2 col-lg-offset-1 col-md-2 col-md-offset-10 col-sm-2 col-sm-offset-10 col-xs-5 col-xs-offset-7">
						<label for="btnBuscarDA"></label>
						<input type="button" name="btnBuscarDA" id="btnBuscarDA" class="btnBuscarDA btn btn-primary form-control form-control-red2" value="Buscar">
					</div>
				</div>
			</div>		
		</div>

<!-- 		<div class="panel panel-default"> -->
<!-- 			<div class="panel-body"> -->
<!-- 				<div class="row rowRsmA"> -->
<!-- 					<div class="col-lg-3 col-md-4 col-sm-6 col-xs-6"> -->
<!-- 						<label for="campoNombreARsmA">Nombre Archivo: </label> -->
<!-- 						<input type="text" class="campoNombreARsmA form-control form-control-red2" readonly="readonly"> -->
<!-- 					</div> -->
<!-- 					<div class="col-lg-2 col-md-4 col-sm-6 col-xs-6"> -->
<!-- 						<label for="campoTipoMovtoRsmA">Tipo Movto: </label> -->
<!-- 						<input type="text" class="campoTipoMovtoRsmA form-control form-control-red2" readonly="readonly"> -->
<!-- 					</div> -->
<!-- 					<div class="col-lg-2 col-md-6 col-sm-6 col-xs-6"> -->
<!-- 						<label for="campoNoMovtoRsmA">No Movto: </label> -->
<!-- 						<input type="text" class="campoNoMovtoRsmA form-control form-control-red2" readonly="readonly"> -->
<!-- 					</div> -->
<!-- 					<div class="col-lg-3 col-md-6 col-sm-6 col-xs-6"> -->
<!-- 						<label for="campoPeriodoRsmA">Periodo: </label> -->
<!-- 						<input type="text" class="campoPeriodoRsmA form-control form-control-red2" readonly="readonly"> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div>	 -->
	</div>
	
	<!--TABLA REVISION ARCHIVOS RECEPCIONADOS RSM-->
	<div class="container contTableRsmA">
		<div class="row rowTableRsmA">
			<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
				<div class="table-responsive">
					<table class="table table-bordered"id="RsmATable">
						<thead>
							<tr>
								<th>Poliz/Item/Endoso Cia</th>
								<th>Cant. Registros</th>
								<th>Debe (MO)</th>
								<th>Haber (MO)</th>
								<th>Monto(MO)</th>
							</tr>
						</thead>
						<tbody>
						
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

		<!--CONTENEDOR TOTALES REVISION DE ARCHIVOS RECEPECIONADOS (RSM)-->
		<div class="container contTotalesRsmA">
			<div class="panel panel-default">
				<div class="panel-body">
					<div class="row rowTotalesRsmA">
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

					<div class="row rowBtnVolverRsmA">
						<div class="col-lg-2 col-lg-offset-10 col-md-2 col-md-offset-10 col-sm-3 col-sm-offset-9 col-xs-4 col-xs-offset-8">
							<label for="btnVolverRsmA"></label>
							<input type="button" class="btn btn-danger form-control form-control-red2" id="btnVolver" name="btnVolverRsmA" value="Volver">
						</div>
					</div>
		</div>
	<!--</div>-->
</body>
</html>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>Resumen Cuenta Corriente</title>
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <script src="../../js/jquery.min.js"></script>
	<script src="../../js/jquery-1.9.1.js"></script>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <link rel="stylesheet" href="../../css/index.css">
    <!--PLUGIN DATATABLES-->
    <script src="../../js/datatables.min.js"></script>
	<script src="../../js/revisararchivos.js"> </script>
	<link rel="stylesheet" href="../../css/datatables.min.css">
	<script src="../../js/resumencc.js"> </script>
	<!--FIN DATATABLES-->
</head>
<body>
	<!--TITULO DE PAGINA Y LOGO-->
	<header>
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Resumen Cuenta Cte.</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>
		</div>
		<hr class="linea">
	</header>
	
	<!--SET DE CONTROLES RESUMEN CUENTA CORRIENTE-->
	<div class="container contControlsRCC">
		<div class="row rowControlRCC">
			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
				<div class="panel panel-default">
					<div class="panel-body">
						<label for="campoSponsorRCC">Sponsor:</label>
						<input type="text" class="campoSponsorRCC form-control form-control-red2" name="campoSponsorRCC" id="sponsortext" readonly="readonly">
					</div>
				</div>
			</div>
		</div>
		
		<div class="panel panel-default">
			<div class="panel-body">
				<!--FILA DE PRIMER SET DE CONTROLES-->
				<div class="row">
					<div class="col-lg-3">
						<label for="campoPDesdeRCC">Periodo Desde:</label>
						<input type="text" name="campoPDesdeRCC" id="campoPDesdeRCC" class="campoPDesdeRCC form-control form-control-red2">
					</div>
					<div class="col-lg-3">
						<label for="campoPHastaRCC">Periodo Hasta:</label>
						<input type="text" name="campoPHastaRCC" id="campoPHastaRCC" class="campoPHastaRCC form-control form-control-red2">
					</div>
					<div class="col-lg-3">
						<label for="campoRutClienteRCC">Rut Cliente</label>
						<input type="text" name="campoRutClienteRCC" id="campoRutClienteRCC" class="campoRutClienteRCC form-control form-control-red2" required>
					</div>
				</div>
			</div>
		</div>
				
		<!--FILA DE CONTROLES CON VISIBILIDAD VALIDADA-->
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row rowselectTipoMovto">
					<div class="col-md-3">
						<label for="selectTipoMovtoCC">Tipo Movimiento</label>
						<select name="selectTipoMovtoCC" id="selectTipoMovtoCC" class="selectTipoMovtoCC form-control form-control-red2" onchange="habilitar(this.value);">
							<!--VALORES PARA VISUALIZAR EL FUNCIONAMIENTO DEL SELECT-->
							<option value="null">Seleccione una opción</option>
							<option value="informe">Informe</option>
							<option value="cuadratura">Cuadratura</option>
							<option value="recaudacion">Recaudacion</option>
							<option value="resumen">Resumen</option>
						</select>
					</div>
					<!--CONTROLES OCULTOS-->
					<div class="col-md-3" id="col-hideControls">
						<div class="radio">
							<label>
								<input type="radio" name="opciones" id="radioTicketCC" value="radioTicketCC" disabled onchange="habilitar(this.value);">
						   		Ticket
							</label>
							<input type="text" name="campoTicketCC" id="campoTicketCC" class="campoTicketCC form-control form-control-red2" disabled="true">
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="opciones" id="radioComprobanteCC" value="radioComprobanteCC" disabled onchange="habilitar(this.value);">
						   		Comprobante
							</label>
							<input type="text" name="campoComprobanteCC" id="campoComprobanteCC" class="campoComprobanteCC form-control form-control-red2" disabled="true">
						</div>
					</div>
				</div>
			</div>
		</div>

		<!--TERCERA FILA DE CONTROLES-->
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-lg col-md-3">
						<label for="campoPISponsorRCC">Poliza/Item/Sponsor</label>
						<input type="text" name="campoPISponsorRCC" id="campoPISponsorRCC" class="campoPISponsorRCC form-control form-control-red2">
					</div>
					<div class="col-lg col-md-3">
						<label for="campoPICRCC">Poliza/Item/Cia</label>
						<input type="text" name="campoPICRCC" id="campoPICRCC" class="campoPICRCC form-control form-control-red2">
					</div>
					<div class="col-lg col-md-2">
						<label for="campoEndosoCiaRCC">Endoso Cia</label>
						<input type="text" name="campoEndosoCiaRCC" id="campoEndosoCiaRCC" class="campoEndosoCiaRCC form-control form-control-red2">
					</div>
					<div class="col-lg col-md-2">
						<label for="selectTipoPrimaRCC">Tipo Prima</label>
						<select name="selectTipoPrimaRCC" id="selectTipoPrimaRCC" class="selectTipoPrimaRCC form-control form-control-red2"></select>
					</div>
					<div class="col-md-2">
						<label for="selectEstadoCC">Estados</label>
						<select name="selectEstadoCC" id="selectEstadoCC" class="selectEstadoCC form-control form-control-red2"></select>
					</div>
				</div>

				<!--ROW BOTON BUSCAR-->
				<div class="row rowBtnBuscarDC">
					<div class="col-lg-2 col-lg-offset-10 col-md-2 col-md-offset-10 col-sm-3 col-sm-offset-9 col-xs-4 col-xs-offset-8 ">
						<label for="btnBuscarDC"></label>
						<input type="button" class="btn btn-primary form-control form-control-red2" id="btnBuscarDC" name="btnBuscarDC" value="Buscar">
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--CONTENEDOR DE TABLA RESUMEN CUENTA CORRIENTE-->
	<div class="container contTableRCC">
		<div class="row">
			<div class="col-xs-12">
				<div class="table-responsive">
					<table class="table table-bordered" id="RCTable">
						<thead>
							<tr class="cabecera">
								<th>Tipo Movto</th>
								<th>No. Movto</th>
								<th>Pago Periodo</th>
								<th>Poliza/Item/Endoso Cia</th>
								<th>Debe (MO)</th>
								<th>Haber (MO)</th>
								<th>Monto (MO)</th>
								<th>Estado</th>
								<th>Ticket</th>
								<th>Comprobante</th>
								<th>Fecha Carga</th>
							</tr>
						</thead>
						<tbody>

							<!-- Se carga el resto de la tabla con datos desde el jqeury resumencc -->

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
	

	<div class="container contTotalesRCC">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-2">
						<label for="campoTotalDebeRCC">Total Debe</label>
						<input type="text" name="campoTotalDebeRCC" id="campoTotalDebeRCC" class="campoTotalDebeRCC form-control form-control-red2">
					</div>
					<div class="col-md-2">
						<label for="campoTotalHaberRCC">Total Haber</label>
						<input type="text" name="campoTotalHaberRCC" id="campoTotalHaberRCC" class="campoTotalHaberRCC form-control form-control-red2">
					</div>
					<div class="col-md-2">
						<label for="campoTotalRCC">Total</label>
						<input type="text" name="campoTotalRCC" id="campoTotalRCC" class="campoTotalRCC form-control form-control-red2">
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

<!--SCRIPTS-->

	
</html>
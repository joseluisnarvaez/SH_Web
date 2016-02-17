<!DOCTYPE html>
<html lang="ES">
    <head>
        <title>Resumen Recaudacion</title>
        <script src="../../js/jquery.min.js"></script>
		<script src="../../js/jquery-1.9.1.js"></script>
        <link rel="stylesheet" href="../../css/bootstrap.min.css">
        <link rel="stylesheet" href="../../css/index.css">
        <script src="../../js/resumenarchivos.js"></script>

    </head>
	
	<body>
	
		<div class="container contResumen">
			<div class="row">
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6 col1">
					<p>Resumen recaudaci&oacuten que ser&aacute cargada</p>
				</div>
				<div class="col-lg-2 col-lg-offset-7 col-md-2 col-md-offset-6 col-sm-4 col-sm-offset-4 col-xs-6 ">
					<img src="../../img/logo.png" class="logoCelda"alt="">
				</div>
			</div>

		</div>
		<div class="container contenedorSponsor">
		<div class="row">
			<div class="col-md-6">
				<div class="subcapaNombreSponsor"> <!--REVISAR ENMARCADO DE NOMBRESPONSOR!!-->
					<table class="tablaNombreSponsor">
					<thead>
						<tr>
							<td class="TDsponsor">Sponsor: </td>
							<td><input type="text" class="form-control form-control-red" id="sponsortext" readonly="readonly"></td>
<!-- 							<td class="TDsponsor">Tipo Movimiento</td> -->
<!-- 							<td ><select name="selectSponsor" id="selectMovimientos" placeholder="sponsor"></select></td> -->
						</tr>
						
					</thead>
				</table>
				</div>
			</div>
		</div>
	</div>

		<hr class="linea">
	<!--
		<div class="textoTitulo">
			<p>Resumen recaudaci&oacuten que ser&aacute cargada</strong>
			<hr class="linea">
			</p>
		</div><br>-->
		
	<table class="table table-bordered"  id="tablaCC">
	<thead class="thead-default">
		<tr class="cabecera">
			
			<td>Confirmar</td>
			<td>Tipo Movimiento</td>
			<td>Nombre Archivo</td>
			<td>Fecha Procesado</td>
			<td>Hora Procesado</td>
			<td>Cantidad Registros</td>
			<td>Monto Pagado en Pesos</td>
		</tr>
	</thead>
	
	<tbody>
	
	</tbody>
	
	</table>
	<!--
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-lg-4 col-mg col-sm-4 col-sm-offset-4 col-md-4 col-md-offset-4 col-xs-12  ">
				<form>
				<input type ="button" class="btn btn-primary"name="Confirmar" class="" id="confirmar" value="Confirmar"/>
				<input type ="button" class="btn btn-default" name="Rechazar" class="" id="rechazar" value="Rechazar"/>
				<input type ="button" class="btn btn-danger" name="Cancelar" class="" id="cancelar" value="Cancelar"/>
				</form>

			</div>
			<div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
		</div>
	</div>
	-->
	<!--
	<div class="container contResumen">
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<div class="btnOptions">
				<form>
				<input type ="button" class="btn btn-primary"name="Confirmar" id="confirmar" value="Confirmar"/>
				<input type ="button" class="btn btn-default" name="Rechazar" id="rechazar" value="Rechazar"/>
				<input type ="button" class="btn btn-danger" name="Cancelar" id="cancelar" value="Cancelar"/>
				</form>
				</div>
			</div>
		</div>
	</div>
 -->
	<!-- NOTA!: MEJORAR POSICIONAMIENTO DE SET DE BOTONES. ACTUALMENTE REALIZACON CON %(33%)-->
		<div class="btnRecauda" id="botones">
			<form>
				<input type ="button" class="btn btn-primary"name="Confirmar" id="Ver" value="Ver Archivo"/>
<!-- 			<input type ="button" class="btn btn-danger" name="Rechazar" id="rechazar" value="Rechazar"/> -->
			<input type ="button" class="btn btn-primary" name="Volver" id="volver" value="Volver"/>
			</form>
		</div>
	
	
	
 
</body>

</html>
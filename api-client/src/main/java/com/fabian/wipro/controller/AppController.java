package com.fabian.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fabian.wipro.entities.CepInformation;
import com.fabian.wipro.request.CheckSpei;
import com.fabian.wipro.response.CheckSpeiResponse;
import com.fabian.wipro.service.CepInformationService;
import com.fabian.wipro.utils.CheckInformation;


@RestController
public class AppController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CepInformationService CepInformationService;


	@RequestMapping(value="/check/status",produces={"application/json"})
	public CheckSpeiResponse checkSpei(@RequestBody CheckSpei checkSpei) {
		logger.info("Busqueda de información para la cuenta: " + checkSpei.getCuenta());
		CheckSpeiResponse response = new CheckSpeiResponse();
		CheckInformation checkInformation = new CheckInformation();
		CepInformation cepInformation =	null;
		try {
			if(checkSpei.getBusqueda().equals("1")) {//Busqueda por clave de rastreo
				logger.info("Request");
				cepInformation = CepInformationService
						.findByFechaAndClaveRastreoAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
						checkSpei.getFecha()
						, checkSpei.getClaveRastreo()
						, checkSpei.getBancoOrigen()
						, checkSpei.getBancoDestino()
						, checkSpei.getCuenta()
						, checkSpei.getMonto());
				logger.info("Response");
				response = checkInformation.processInformation(cepInformation);

			}else if(checkSpei.getBusqueda().equals("2")) {// Busqueda por referencia bancaria
				logger.info("Request");
				cepInformation = CepInformationService
						.findByFechaAndReferenciaAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
						checkSpei.getFecha()
						, checkSpei.getReferencia()
						, checkSpei.getBancoOrigen()
						, checkSpei.getBancoDestino()
						, checkSpei.getCuenta()
						, checkSpei.getMonto());
				logger.info("Response");
				response = checkInformation.processInformation(cepInformation);
			}else {//opcion no valida
				response = new CheckSpeiResponse("2", "Opcion de busqueda no válida", cepInformation);
			}
		} catch (Exception e) {
			logger.error("Internal error in checkSpei", e.getMessage(),e);
			response = new CheckSpeiResponse("-1", "Error en el servicio " + e.getCause(), null);
		}
		logger.info("{ ResponseCode: " + response.getResponseCode() + ", message: " + response.getMessage() + " }");

		return response;
	}
}
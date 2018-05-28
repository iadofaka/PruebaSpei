/**
 * 
 */
package com.fabian.wipro.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fabian.wipro.entities.CepInformation;
import com.fabian.wipro.response.CheckSpeiResponse;


/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class CheckInformation {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());


	public CheckSpeiResponse processInformation(CepInformation cepInformation) throws Exception {
		CheckSpeiResponse response = new CheckSpeiResponse();
		
		if(cepInformation != null) {//validaciónnde resultados
			logger.info(cepInformation.getStatus());
			if(cepInformation.getStatus().equals("Aprobado")) {//Verificación de estaus de operación
				response = new CheckSpeiResponse("0", "Spei Aprobado", cepInformation);
			}else {
				logger.info("Transaction Id :" + cepInformation.getId());
				response = new CheckSpeiResponse("0", "Spei Cancelado", cepInformation);
			}
		}else {
			//no existe informacion
			logger.info("Información inexistente para su consulta");
			response = new CheckSpeiResponse("1", "No se encontraron resultados", cepInformation);
		}

		return response;
	}

}

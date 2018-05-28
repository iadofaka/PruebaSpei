/**
 * 
 */
package com.fabian.wipro.service;



import java.util.List;

import com.fabian.wipro.entities.CepInformation;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public interface CepInformationService {

	//Método para guardar información
	CepInformation save(CepInformation cepInformation);

	CepInformation findByFechaAndClaveRastreoAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
			String fecha
			,String claveRastreo
			,String bancoOrigen
			, String bancoDestino
			, String cuenta
			, double monto);

	CepInformation findByFechaAndReferenciaAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
			String fecha
			,String referencia
			,String bancoOrigen
			, String bancoDestino
			, String cuenta
			, double monto);
	
	List<CepInformation> findByStatus(String status);

}

/**
 * 
 */
package com.fabian.wipro.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.fabian.wipro.entities.CepInformation;

/**
 * @author Ing. Fabian Carvajal Acolt
 */

public interface CepInformationRepository extends CrudRepository<CepInformation, Long>{
	
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

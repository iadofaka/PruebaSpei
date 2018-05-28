/**
 * 
 */
package com.fabian.wipro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabian.wipro.entities.CepInformation;
import com.fabian.wipro.repository.CepInformationRepository;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
@Service
public class CepInformationServiceImpl implements CepInformationService {

	@Autowired
	CepInformationRepository cepInformationRepository; 

	/* (non-Javadoc)
	 * @see com.fabian.wipro.service.CepInformationService#save(com.fabian.wipro.entities.CepInformation)
	 */
	@Override
	public CepInformation save(CepInformation cepInformation) {
		return cepInformationRepository.save(cepInformation);
	}

	/* (non-Javadoc)
	 * @see com.fabian.wipro.service.CepInformationService#findByFechaAndClaveRastreoAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double)
	 */
	@Override
	public CepInformation findByFechaAndClaveRastreoAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(String fecha,
			String claveRastreo, String bancoOrigen, String bancoDestino, String cuenta, double monto) {
		// TODO Auto-generated method stub
		return cepInformationRepository.findByFechaAndClaveRastreoAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
				fecha
				, claveRastreo
				, bancoOrigen
				, bancoDestino
				, cuenta
				, monto);
	}

	/* (non-Javadoc)
	 * @see com.fabian.wipro.service.CepInformationService#findByFechaAndReferenciaAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(java.util.Date, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double)
	 */
	@Override
	public CepInformation findByFechaAndReferenciaAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(String fecha,
			String referencia, String bancoOrigen, String bancoDestino, String cuenta, double monto) {
		// TODO Auto-generated method stub
		return cepInformationRepository.findByFechaAndReferenciaAndBancoOrigenAndBancoDestinoAndCuentaAndMonto(
				fecha
				, referencia
				, bancoOrigen
				, bancoDestino
				, cuenta
				, monto);
	}

	/* (non-Javadoc)
	 * @see com.fabian.wipro.service.CepInformationService#findByStatus(java.lang.String)
	 */
	@Override
	public List<CepInformation> findByStatus(String status) {
		
		return cepInformationRepository.findByStatus(status);
	}

}

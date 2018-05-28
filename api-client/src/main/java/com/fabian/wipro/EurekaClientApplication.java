package com.fabian.wipro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabian.wipro.entities.CepInformation;
import com.fabian.wipro.service.CepInformationService;


import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientApplication {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CepInformationService CepInformationService;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
    
    @Bean
	CommandLineRunner runner(CepInformationService service) {
		return args -> {
			service.save(
					new CepInformation(
							"22-05-2018"
							, "10000001"
							, "00001"
							, "BBVA BANCOMER"
							, "SCOTIABANK"
							, "0123456789102145878"
							, 6584.00
							, "Aprobado"
							,null));	
			service.save(
					new CepInformation(
							"22-05-2018"
							, "10000002"
							, "00002"
							, "SCOTIABANK"
							, "SANTANDER"
							, "087542135987451254"
							, 658.00
							, "Aprobado"
							,null));
			service.save(
					new CepInformation(
							"23-05-2018"
							, "10000003"
							, "0000003"
							, "BANKAOOL"
							, "BBVA BANCOMER"
							, "004558965214785321"
							, 8745214.00
							, "Cancelado"
							, "Cuenta destino bloqueada"));
			service.save(
					new CepInformation(
							"23-05-2018"
							, "10000004"
							, "0000004"
							, "BANSI"
							, "SCOTIABANK"
							, "0012548963258756314"
							, 632548.00
							, "Cancelado"
							, "Cuenta destino bloqueada por listas negras"));
			service.save(
					new CepInformation(
							"23-05-2018"
							, "10000005"
							, "0000005"
							, "BBVA BANCOMER"
							, "BANCREA"
							, "0012589634178524632"
							, 785412.00
							, "Aprobado"
							,null));
			service.save(
					new CepInformation(
							"24-05-2018"
							, "10000006"
							, "0000006"
							, "BBVA BANCOMER"
							, "BANAMEX_CITI"
							, "00125258888965412354"
							, 365987.00
							, "Cancelado"
							, "Banco destino inválido"));
			service.save(
					new CepInformation(
							"24-05-2018"
							, "10000007"
							, "0000007"
							, "STP"
							, "SCOTIABANK"
							, "001258963548752462"
							, 545555.00
							, "Cancelado"
							,"Cuenta destino Bloqueada"));
			service.save(
					new CepInformation(
							"24-05-2018"
							, "10000008"
							, "0000008"
							, "BANAMEX"
							, "SCOTIABANK"
							, "002156895456325485"
							, 5877.00
							, "Aprobado"
							, null));
			service.save(
					new CepInformation(
							"25-05-2018"
							, "10000009"
							, "0000009"
							, "HSBC"
							, "SCOTIABANK"
							, "001456987563245987"
							, 85468.00
							, "Cancelado"
							, "Cuenta destino bloqueada por listas negras"));
			service.save(
					new CepInformation(
							"25-05-2018"
							, "100000010"
							, "00000010"
							, "BANAMEX"
							, "BANCOPPEL"
							, "005648965723497852"
							, 1557.00
							, "Cancelado"
							,"Banco destino inválido"));
			service.save(
					new CepInformation(
							"25-05-2018"
							, "100000011"
							,"00000011"
							, "INBURSA"
							, "PROFUTURO"
							, "006897463284678931"
							, 120.00
							, "Aprobado"
							, null));
		};
	}
}

@RestController
class ServiceInstanceRestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-instances/{applicationName}")
    public List<ServiceInstance> serviceInstancesByApplicationName(
            @PathVariable String applicationName) {
        return this.discoveryClient.getInstances(applicationName);
    }
}

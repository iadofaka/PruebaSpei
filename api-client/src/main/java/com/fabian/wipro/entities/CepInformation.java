/**
 * 
 */
package com.fabian.wipro.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
@Entity
@Table(name = "test_wipro_cep_information")
public class CepInformation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3233553372973373882L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique= true)
	private Long id;
	@Column(name = "date")
	private String fecha;
	@Column(name = "tracking_key")
	private String claveRastreo;
	@Column(name = "reference")
	private String referencia;
	@Column(name = "source_bank")
	private String bancoOrigen;
	@Column(name = "target_bank")
	private String bancoDestino;
	@Column(name = "account")
	private String cuenta;
	@Column(name = "amount")
	private double monto;
	@Column(name = "status")
	private String status;
	@Column(name = "details")
	private String details;
	
	protected CepInformation() {
		
	}
	
	public CepInformation(String fecha, String claveRastreo, String referencia, String bancoOrigen, String bancoDestino,
			String cuenta, double monto, String status, String details) {
		super();
		this.fecha = fecha;
		this.claveRastreo = claveRastreo;
		this.referencia = referencia;
		this.bancoOrigen = bancoOrigen;
		this.bancoDestino = bancoDestino;
		this.cuenta = cuenta;
		this.monto = monto;
		this.status =  status;
		this.details = details;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getClaveRastreo() {
		return claveRastreo;
	}

	public void setClaveRastreo(String claveRastreo) {
		this.claveRastreo = claveRastreo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getBancoOrigen() {
		return bancoOrigen;
	}

	public void setBancoOrigen(String bancoOrigen) {
		this.bancoOrigen = bancoOrigen;
	}

	public String getBancoDestino() {
		return bancoDestino;
	}

	public void setBancoDestino(String bancoDestino) {
		this.bancoDestino = bancoDestino;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}

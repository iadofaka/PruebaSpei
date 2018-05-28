/**
 * 
 */
package com.fabian.wipro.request;

import java.io.Serializable;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class CheckSpei implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fecha;
	
	private String claveRastreo;
	
	private String referencia;
	
	private String bancoOrigen;
	
	private String bancoDestino;
	
	private String cuenta;
	
	private double monto;
	
	private String busqueda;

	public CheckSpei() {
		
	}

	public CheckSpei(String fecha, String claveRastreo, String referencia, String bancoOrigen, String bancoDestino,
			String cuenta, double monto, String busqueda) {
		super();
		this.fecha = fecha;
		this.claveRastreo = claveRastreo;
		this.referencia = referencia;
		this.bancoOrigen = bancoOrigen;
		this.bancoDestino = bancoDestino;
		this.cuenta = cuenta;
		this.monto = monto;
		this.busqueda = busqueda;
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

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}
	
}

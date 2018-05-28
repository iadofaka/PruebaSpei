/**
 * 
 */
package com.fabian.wipro.response;

import java.io.Serializable;

import com.fabian.wipro.entities.CepInformation;

/**
 * @author Ing. Fabian Carvajal Acolt
 *
 */
public class CheckSpeiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5291627208069397569L;

	private String responseCode;
	private String message;
	private CepInformation result;
	private String details;
	
	public CheckSpeiResponse() {
		
	}
	
	public CheckSpeiResponse(String responseCode, String message, CepInformation result) {
		this.responseCode = responseCode;
		this.message = message;
		this.result = result;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CepInformation getResult() {
		return result;
	}

	public void setResult(CepInformation result) {
		this.result = result;
	}


	public String getDetails() {
		return details;
	}


	public void setDetails(String details) {
		this.details = details;
	}

}

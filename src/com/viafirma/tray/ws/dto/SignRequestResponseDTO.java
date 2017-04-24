package com.viafirma.tray.ws.dto;

public class SignRequestResponseDTO extends WSInformationDTO {
	
	private String redirectUrl;

	public SignRequestResponseDTO() {
		super();
		redirectUrl = "";
	}
	
	//*******************************
	//		Getters / Setters
	//*******************************
	public String getRedirectUrl() {
		return redirectUrl;
	}

	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}
	
}

package de.adabaskar.play.domainfake;

import java.util.Date;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class BusinessServiceFake {

	public Date getServiceRequestTime() {		
		return new Date();
	}

	
	
}

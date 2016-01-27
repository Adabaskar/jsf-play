package de.adabaskar.play.domainfake;

import java.util.Date;

import javax.enterprise.context.RequestScoped;

/**
 * Injected to view model. Simulates a domain layer. 
 * @author BARTCZBO
 *
 */
@RequestScoped
public class BusinessServiceDummy {

	public Date getServiceRequestTime() {		
		return new Date();
	}

	
	
}

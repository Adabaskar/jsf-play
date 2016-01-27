package de.adabaskar.play.jsf.viewmodel;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.adabaskar.play.domainfake.BusinessServiceFake;

/**
 * Simulates a view model, like for instance proposed by the MVVM pattern. Named annotation is required in order to be 
 * accessible via expression language in a jsf view description file. 
 * @author BARTCZBO
 *
 */
@Named
@RequestScoped
public class EntryPageViewModel {
	
	BusinessServiceFake _serviceFake;
	
	@Inject
	void setBusinessServiceFake(BusinessServiceFake fake) {
		_serviceFake = fake;
	}
	
	public Date getRequestTime() {
		return  _serviceFake.getServiceRequestTime();
	}
	
	
	
}

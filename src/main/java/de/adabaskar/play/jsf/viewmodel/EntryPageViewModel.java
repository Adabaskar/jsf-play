package de.adabaskar.play.jsf.viewmodel;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import de.adabaskar.play.domainfake.BusinessServiceDummy;

/**
 * Simulates a view model, like for instance proposed by the MVVM pattern. Named annotation is required in order to be 
 * accessible via expression language in a jsf view description file. 
 * @author BARTCZBO
 *
 */
@Named
@RequestScoped
public class EntryPageViewModel {
	
	BusinessServiceDummy _serviceFake;
	
	@Inject
	void setBusinessServiceFake(BusinessServiceDummy fake) {
		_serviceFake = fake;
	}
	
	public Date getRequestTime() {
		return  _serviceFake.getServiceRequestTime();
	}
	
	
	
}

package com.anily.petclinic;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetClinicConfiguration {
	
	@Autowired
	private PetClinicProperties petClinicProperties;
	
	//After PetClinicProperties bean created and injected spring container invokes this method
	@PostConstruct
	public void init() {
		System.out.println("Dispay owners with pets : " + petClinicProperties.isDisplayOwnersWithPets());
	}

}

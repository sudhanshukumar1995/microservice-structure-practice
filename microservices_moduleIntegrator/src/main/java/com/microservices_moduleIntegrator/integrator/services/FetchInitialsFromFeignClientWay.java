package com.microservices_moduleIntegrator.integrator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseFirstName;
import com.microservices_moduleIntegrator.integrator.dataTransferObjects.ResponseLastName;
import com.microservices_moduleIntegrator.integrator.usingFeignClients.ModuleAClient;
import com.microservices_moduleIntegrator.integrator.usingFeignClients.ModuleBClient;

@Service
public class FetchInitialsFromFeignClientWay {

	private ModuleAClient a;
	private ModuleBClient b;

	@Autowired
	public FetchInitialsFromFeignClientWay(ModuleAClient a, ModuleBClient b) {
		this.a = a;
		this.b = b;
	}

	public ResponseFirstName fetchFirstName() {
		return a.getFirstName();
	}

	public ResponseLastName fetchLastName() {
		return b.getLastName();
	}

}

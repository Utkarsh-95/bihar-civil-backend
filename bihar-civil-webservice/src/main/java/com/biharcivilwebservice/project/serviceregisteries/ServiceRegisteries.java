package com.biharcivilwebservice.project.serviceregisteries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.biharcivilwebservice.project.db.services.WeightVoltageJDBCService;

@Component
public class ServiceRegisteries {

	@Autowired
	private WeightVoltageJDBCService weightVoltageJDBCService;

	@Bean
	public WeightVoltageJDBCService getWeightVoltageJDBCService() {
		return weightVoltageJDBCService;
	}
	
	
	
}

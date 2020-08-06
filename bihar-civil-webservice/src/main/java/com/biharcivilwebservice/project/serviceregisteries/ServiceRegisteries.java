package com.biharcivilwebservice.project.serviceregisteries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.biharcivilwebservice.project.db.services.WeightVoltageJDBCService;
import com.biharcivilwebservice.project.jpa.service.DeviceMasterService;
import com.biharcivilwebservice.project.jpa.service.VehicleMasterService;

@Component
public class ServiceRegisteries {

	@Autowired
	private WeightVoltageJDBCService weightVoltageJDBCService;
	
	@Autowired
	private DeviceMasterService deviceMasterService;
	
	@Autowired
	private VehicleMasterService vehicleMasterService;

	public VehicleMasterService getVehicleMasterService() {
		return vehicleMasterService;
	}

	@Bean
	public WeightVoltageJDBCService getWeightVoltageJDBCService() {
		return weightVoltageJDBCService;
	}

	public DeviceMasterService getDeviceMasterService() {
		return deviceMasterService;
	}
	
	
	
	
}

package com.biharcivilwebservice.project.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biharcivilwebservice.project.entities.VehicleMasterTableData;
import com.biharcivilwebservice.project.jpa.repo.VehicleMatserRepo;

@Service
public class VehicleMasterService {

	@Autowired
	private VehicleMatserRepo vehicleMasterRepso;
	
	public List<VehicleMasterTableData> findAll(){
		return this.vehicleMasterRepso.findAll();
	}
	
	public void save(VehicleMasterTableData data){
		this.vehicleMasterRepso.save(data);
	}
	
	
}

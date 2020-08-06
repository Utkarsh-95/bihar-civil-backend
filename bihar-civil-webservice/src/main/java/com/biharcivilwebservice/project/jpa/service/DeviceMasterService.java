package com.biharcivilwebservice.project.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biharcivilwebservice.project.entities.DeviceMasterTableData;
import com.biharcivilwebservice.project.jpa.repo.DeviceMasterRepo;

@Service
public class DeviceMasterService {

	@Autowired
	private DeviceMasterRepo deviceMasterRepo;
	
	public List<DeviceMasterTableData> findAll(){
		return deviceMasterRepo.findAll();
	}
	
	public void save(DeviceMasterTableData data){
		deviceMasterRepo.save(data);
	}
	
	
}

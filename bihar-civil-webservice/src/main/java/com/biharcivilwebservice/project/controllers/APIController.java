package com.biharcivilwebservice.project.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biharcivilwebservice.project.entities.DeviceMasterTableData;
import com.biharcivilwebservice.project.entities.VehicleMasterTableData;
import com.biharcivilwebservice.project.pojos.RequestWeightVoltageParam;
import com.biharcivilwebservice.project.pojos.ResponseWrapper;
import com.biharcivilwebservice.project.pojos.WeightVoltageData;
import com.biharcivilwebservice.project.serviceregisteries.ServiceRegisteries;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*", maxAge = 3600)
public class APIController {

	@Autowired
	private ServiceRegisteries services;

	@GetMapping("testAPI/{testString}")
	public String testAPI(@PathVariable("testString") String testString) {
		return "added on github to check pull "+testString;
	}
	
	@PostMapping("getWeightVoltageData")
	public List<WeightVoltageData> geWeightVoltageData(@RequestBody RequestWeightVoltageParam data) {
		
//		services.getWeightVoltageJDBCService()
//		.getWeightVoltageData(data);
//		
		return services.getWeightVoltageJDBCService()
				.getWeightVoltageData(data);
	}
	
	@GetMapping("findAllDeviceMasterData")
	public ResponseEntity<ResponseWrapper> findAllDeviceMasterData() {
		
		return new ResponseEntity<ResponseWrapper>(new ResponseWrapper(
				new Date().toString(),
				HttpStatus.OK,
				"OK",
				"NA",
				services.getDeviceMasterService().findAll()
				), HttpStatus.OK);
				
	}
	
	
	@PostMapping("saveDeviceMasterData")
	public ResponseEntity<ResponseWrapper> saveDeviceMasterData(@RequestBody DeviceMasterTableData requestData) {
		this.services.getDeviceMasterService().save(requestData);
		
		return new ResponseEntity<ResponseWrapper>(new ResponseWrapper(
				new Date().toString(),
				HttpStatus.OK,
				"OK",
				"NA",
				null
				), HttpStatus.OK);
				
	}
	
	@GetMapping("findAllVehicleMasterData")
	public ResponseEntity<ResponseWrapper> findAllVehicleMasterData() {
		
		return new ResponseEntity<ResponseWrapper>(new ResponseWrapper(
				new Date().toString(),
				HttpStatus.OK,
				"OK",
				"NA",
				services.getVehicleMasterService().findAll()
				), HttpStatus.OK);
				
	}
	
	
	@PostMapping("saveVehicleMasterData")
	public ResponseEntity<ResponseWrapper> saveVehicleMasterData(@RequestBody VehicleMasterTableData requestData) {
		this.services.getVehicleMasterService().save(requestData);
		
		return new ResponseEntity<ResponseWrapper>(new ResponseWrapper(
				new Date().toString(),
				HttpStatus.OK,
				"OK",
				"NA",
				null
				), HttpStatus.OK);
				
	}
	
}

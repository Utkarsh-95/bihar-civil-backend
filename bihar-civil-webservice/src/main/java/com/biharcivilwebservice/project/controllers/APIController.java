package com.biharcivilwebservice.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biharcivilwebservice.project.pojos.RequestWeightVoltageParam;
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
		return "test string api "+testString;
	}
	
	@PostMapping("getWeightVoltageData")
	public List<WeightVoltageData> geWeightVoltageData(@RequestBody RequestWeightVoltageParam data) {
		
//		services.getWeightVoltageJDBCService()
//		.getWeightVoltageData(data);
//		
		return services.getWeightVoltageJDBCService()
				.getWeightVoltageData(data);
	}
	
}

package com.biharcivilwebservice.project.db.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

import com.biharcivilwebservice.project.pojos.RequestWeightVoltageParam;
import com.biharcivilwebservice.project.pojos.WeightVoltageData;
import com.biharcivilwebservice.project.pojos.WeightVoltageDataRowMapper;

@Service
public class WeightVoltageJDBCService {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<WeightVoltageData> getWeightVoltageData(RequestWeightVoltageParam data) {
		
		List<WeightVoltageData> dataList=null;
		
		if(data.getImei()!=null && data.getToDate()!=null) {
			
			dataList=namedParameterJdbcTemplate.query(
			  "SELECT imeino, packetdate, packettime, gsmsignal  FROM \"parsed_loc_device_record_"+data.getToDate()+"\" where imeino = '"+data.getImei()+"' "
			  		+ "order by (packetdate+packettime)",  
			  new WeightVoltageDataRowMapper());
			
		}
		
		return dataList.subList(0, 1);
	}

}

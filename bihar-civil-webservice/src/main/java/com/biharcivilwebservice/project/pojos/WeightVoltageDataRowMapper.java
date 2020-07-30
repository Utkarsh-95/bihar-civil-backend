package com.biharcivilwebservice.project.pojos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WeightVoltageDataRowMapper implements RowMapper{

	WeightVoltageData data=new WeightVoltageData();
	
	@Override
	public WeightVoltageData mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		data.setData(rs.getDouble("gsmsignal"));
		data.setTime(rs.getString("packettime"));
		data.setImei(rs.getString("imeino"));
		data.setDate(rs.getString("packetdate"));
		return data;
	}

}

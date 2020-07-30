package com.biharcivilwebservice.project.pojos;

import java.util.ArrayList;
import java.util.List;

public class WeightVoltageData {

	private String imei;
	private String date;
	private List<Double> data=new ArrayList<>();
	private List<String> time=new ArrayList<>();
	
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Double> getData() {
		return data;
	}
	public void setData(Double data) {
		this.data.add(data);
	}
	public List<String> getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time.add(time);
	}

	
	
	
	
}

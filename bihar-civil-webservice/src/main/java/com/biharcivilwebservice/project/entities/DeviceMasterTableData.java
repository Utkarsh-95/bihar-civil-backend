package com.biharcivilwebservice.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "device_master")
public class DeviceMasterTableData {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long deviceId;
	private String deviceImei;
	private String iccId;
	private String mobile_one;
	private String mobile_two;
	
	public DeviceMasterTableData() {
	}
	
	public DeviceMasterTableData(int deviceId, String deviceImei, String iccId, String mobile_one, String mobile_two) {
		super();
		this.deviceId = deviceId;
		this.deviceImei = deviceImei;
		this.iccId = iccId;
		this.mobile_one = mobile_one;
		this.mobile_two = mobile_two;
	}

	public long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(long deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceImei() {
		return deviceImei;
	}

	public void setDeviceImei(String deviceImei) {
		this.deviceImei = deviceImei;
	}

	public String getIccId() {
		return iccId;
	}

	public void setIccId(String iccId) {
		this.iccId = iccId;
	}

	public String getMobile_one() {
		return mobile_one;
	}

	public void setMobile_one(String mobile_one) {
		this.mobile_one = mobile_one;
	}

	public String getMobile_two() {
		return mobile_two;
	}

	public void setMobile_two(String mobile_two) {
		this.mobile_two = mobile_two;
	}
	
	
	
	
}

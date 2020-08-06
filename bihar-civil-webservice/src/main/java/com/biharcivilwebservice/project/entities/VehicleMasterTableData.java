package com.biharcivilwebservice.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_master")
public class VehicleMasterTableData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long vehicleId;
	private String vehicleNo;
	private Long loginId;
	
	public VehicleMasterTableData() {

	}
	
	public VehicleMasterTableData(long id, long vehicleId, String vehicleNo, Long loginId) {
		super();
		this.id = id;
		this.vehicleId = vehicleId;
		this.vehicleNo = vehicleNo;
		this.loginId = loginId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}
	
	
}

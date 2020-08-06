package com.biharcivilwebservice.project.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biharcivilwebservice.project.entities.VehicleMasterTableData;

@Repository
public interface VehicleMatserRepo extends JpaRepository<VehicleMasterTableData, Long>{

}

package com.biharcivilwebservice.project.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biharcivilwebservice.project.entities.DeviceMasterTableData;

@Repository
public interface DeviceMasterRepo extends JpaRepository<DeviceMasterTableData, Long>{

}

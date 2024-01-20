package com.ros.processing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ros.processing.entity.RosProcessingEntity;

@Repository
public interface MyRepository extends JpaRepository<RosProcessingEntity, Long> {
    
}

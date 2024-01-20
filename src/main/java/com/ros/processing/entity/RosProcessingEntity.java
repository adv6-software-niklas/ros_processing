package com.ros.processing.entity;

import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name="ros_processing")
public class RosProcessingEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Getter
    private UUID configID;

    @Getter
    private String value;

    public RosProcessingEntity() {
        super();
    }

    public RosProcessingEntity(String value, UUID configID) {
        super();
        this.value = value;
        this.configID = configID;
    }
}

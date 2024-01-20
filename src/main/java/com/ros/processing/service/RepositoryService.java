package com.ros.processing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ros.processing.entity.RosProcessingEntity;
import com.ros.processing.repository.MyRepository;

@Service
public class RepositoryService {
  
    private final MyRepository repo;

    @Autowired
    public RepositoryService(MyRepository repo) {
        this.repo = repo;
    }

    public void SaveData(RosProcessingEntity entity) {
        if (entity != null) {
            repo.save(entity);
        } else { 
            System.out.println("Sorry bro, couldn't save processing data to db.");
        }
        
    }
}

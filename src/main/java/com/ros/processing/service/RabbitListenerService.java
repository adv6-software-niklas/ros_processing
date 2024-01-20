package com.ros.processing.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ros.processing.dto.ProcessingDTO;
import com.ros.processing.entity.RosProcessingEntity;

@Service
public class RabbitListenerService {
    private final RepositoryService repo;
    private final ObjectMapper mapper;

    public RabbitListenerService(RepositoryService repo, ObjectMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @RabbitListener(queues = "processing_supply")
    public void recieveMessage(String message) {
        try {
            System.out.println("Received <" + message + ">");
            ProcessingDTO processingDTO = mapper.readValue(message, ProcessingDTO.class);
            repo.SaveData(new RosProcessingEntity(processingDTO.getValue(), processingDTO.getId()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

package com.ros.processing.dto;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class ProcessingDTO {
    @Getter
    @Setter
    private UUID id;

    @Getter
    @Setter
    private String value;

    public ProcessingDTO(UUID id, String value) {
        this.id = id;
        this.value = value;
    }
}

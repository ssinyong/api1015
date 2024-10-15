package org.zerock.api1015.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SampleDTO {

    @NotNull(message = "name cannot be null")
    private String name;

    @Min(value = 10, message = "at least 10")
    private int size;
}

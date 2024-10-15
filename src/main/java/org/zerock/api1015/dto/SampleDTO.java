package org.zerock.api1015.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SampleDTO {

    @NotNull
    private String name;
}

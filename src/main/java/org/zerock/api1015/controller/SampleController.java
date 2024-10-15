package org.zerock.api1015.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.zerock.api1015.dto.SampleDTO;

@RestController
@RequestMapping("/api/v1/sample")
public class SampleController {

    @PostMapping("/ex1")
    public String[] ex1(
            @RequestBody
            @Validated
            SampleDTO sampleDTO){


        return new String[]{"AAA", "BBB", "CCC"};
    }
}

package com.example;

import io.micronaut.http.annotation.*;

@Controller("/nativegcr")
public class NativegcrController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Demo Response";
    }
}
package com.danekblom.lexicon.finalprojectrest.controllers;

import com.danekblom.lexicon.finalprojectrest.model.DocumentationResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/error")
public class RestError {

    private Map<String, String> restError = new HashMap<>();

    public RestError() {
    }

    @GetMapping()
    public DocumentationResponse displayRestErrorMessage() {
        restError.put("Error Message", "Resource Not Found. Please check your request.");

        return new DocumentationResponse(restError);
    }
}

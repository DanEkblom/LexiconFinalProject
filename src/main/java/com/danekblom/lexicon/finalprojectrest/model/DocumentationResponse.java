package com.danekblom.lexicon.finalprojectrest.model;

import java.util.HashMap;
import java.util.Map;

public class DocumentationResponse {

    private Map<String, String> information = new HashMap<>();
    private String error = "";

    public DocumentationResponse(Map information) { //(String instructions)

        this.information = information;
    }

    public DocumentationResponse(String error) {
        this.error = error;
    }

    public Map<String, String> getInformation() {
        return information;
    }

    public void setInformation(Map<String, String> information) {
        this.information = information;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

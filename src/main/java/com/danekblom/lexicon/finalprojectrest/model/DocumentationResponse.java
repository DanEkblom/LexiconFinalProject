package com.danekblom.lexicon.finalprojectrest.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class DocumentationResponse {
    //private String instructions = "";
    private Map<String, String> information = new LinkedHashMap<>();

    public DocumentationResponse(Map information) { //(String instructions)
        //this.instructions = instructions;
        this.information = information;
    }

    /*
    public String getInstructions() {
        //return instructions;
    }

    public void setInstructions(String instructions) {
        //this.instructions = instructions;
    }
    */

    public Map<String, String> getMap() {
        return information;
    }

    public void setMap(Map<String, String> map) {
        this.information = map;
    }
}

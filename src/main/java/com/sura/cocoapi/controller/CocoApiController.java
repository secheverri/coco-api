package com.sura.cocoapi.controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.JsonObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CocoApiController {

    @RequestMapping(value = "/status", method = RequestMethod.GET, produces = "application/json")
    String status() throws JsonMappingException {
        return "Coco API Server Run";
    }
}

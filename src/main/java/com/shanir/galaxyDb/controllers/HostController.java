package com.shanir.galaxyDb.controllers;

import com.shanir.galaxyDb.services.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostController {
    private final HostService hostService;

    @Autowired
    public  HostController (HostService hostService){
        this.hostService = hostService;
    }

    @GetMapping("/test")
    public String getHost(){
        return "Hello world";
    }

}

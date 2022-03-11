package com.shanir.galaxyDb.controllers;

import com.shanir.galaxyDb.models.Host;
import com.shanir.galaxyDb.services.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HostController {
    private final HostService hostService;

    @Autowired
    public HostController(HostService hostService){
        this.hostService = hostService;
    }

    @GetMapping("/entity/post/{hostName}")
    public Host getHostByHostName(@PathVariable String hostName){
        return this.hostService.getById(hostName);
    }

    @DeleteMapping("/deleteByHostName/{hostName}")
    public void deleteByHostName(@PathVariable String hostName){
        this.hostService.deleteByHost(hostName);
    }

    @GetMapping("/getAllHosts")
    public Iterable<Host> getAllHosts(){
        return this.hostService.findAll();
    }

    @PostMapping("/addHost")
    public Host addHost(@RequestBody Host host){
        return this.hostService.addHost(host);
    }
}

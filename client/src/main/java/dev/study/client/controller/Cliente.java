package dev.study.client.controller;

import dev.study.client.service.ServiceClientStaff;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client")
public class Cliente {

    private final ServiceClientStaff serviceClientStaff;

    public Cliente(ServiceClientStaff serviceClientStaff) {
        this.serviceClientStaff = serviceClientStaff;
    }

    @GetMapping
    public String getClient() {
        return "Hello client";
    }

    @GetMapping("staff")
    public String getStaff(){
       return serviceClientStaff.getStaff();
    }
}

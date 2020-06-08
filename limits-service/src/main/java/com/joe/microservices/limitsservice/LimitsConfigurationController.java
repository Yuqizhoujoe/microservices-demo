package com.joe.microservices.limitsservice;

import com.joe.microservices.limitsservice.bean.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @Autowired
    private Environment environment;

    @GetMapping("/limits")
    public LimitConfiguration retrieveFromConfiguration() {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }

    @GetMapping("/configure")
    public String updateConfiguration() {
        return environment.getProperty("damnjoejoe.love.yumi");
    }

}

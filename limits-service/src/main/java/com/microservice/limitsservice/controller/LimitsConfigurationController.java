package com.microservice.limitsservice.controller;

import com.microservice.limitsservice.config.Configuration;
import com.microservice.limitsservice.entity.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LimitConfiguration retriveLimitsFromConfigurations()
    {
        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}

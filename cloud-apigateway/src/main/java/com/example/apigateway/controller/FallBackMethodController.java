package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@RequestMapping("/employeeServiceFallback")
    public String employeeServiceFallback(){
        return "Employee service is taking too long to respond or is down. Please try after some time";
    }

    @RequestMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "Department service is taking too long to respond or is down. Please try after some time";
    }
}

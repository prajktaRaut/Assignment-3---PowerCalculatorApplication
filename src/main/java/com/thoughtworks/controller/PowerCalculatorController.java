package com.thoughtworks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtworks.dto.PowerCalculatorDto;
import com.thoughtworks.service.PowerCalculatorService;

@RequestMapping("/calculator")
@RestController
public class PowerCalculatorController {

	@Autowired
	PowerCalculatorService service;
	
	@PostMapping("/getPower")
    public int getPowerOfNumber(@RequestBody PowerCalculatorDto poweCalculatorDto)
    {
		System.out.println("PowerCalculatorController.getPowerOfNumber()");
		int result = service.calculator(poweCalculatorDto);
		return result;
    }
}

package com.thoughtworks.service;

import org.springframework.stereotype.Service;

import com.thoughtworks.dto.PowerCalculatorDto;

@Service
public class PowerCalculatorService implements PowerCalculatorInterface{


    @Override
    public int calculator(PowerCalculatorDto powerCalculatorDto) {

        int power=1;
        int base = powerCalculatorDto.getBase();
        int exponent = powerCalculatorDto.getExponent();

        for (int i=1;i<=exponent;i++)
        {
            power=power*base;
        }
        return power;

    }
}

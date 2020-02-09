package com.thoughtworks.dto;

public class PowerCalculatorDto {

    int base;
    int exponent;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    @Override
    public String toString() {
        return "PowerCalculatorDto{" +
                "base=" + base +
                ", exponent=" + exponent +
                '}';
    }
}

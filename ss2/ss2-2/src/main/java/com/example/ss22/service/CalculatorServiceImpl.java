package com.example.ss22.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService{

    @Override
    public float calculate(String type, float number1, float number2) {
        switch (type){
            case "addition":
                return number1+number2;
            case "subtraction":
                return  number1-number2;
            case "multiplication" :
                return number1*number2;
            case "division":
                return number1/number2;
        }
        return 0;
    }
}

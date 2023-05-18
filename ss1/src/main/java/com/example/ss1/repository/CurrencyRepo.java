package com.example.ss1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CurrencyRepo implements ICurrencyRepo{
    @Override
    public float convert(float usd) {
        float result = usd* 23000;
        return result;
    }
}

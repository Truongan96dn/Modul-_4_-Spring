package com.example.ss1.repository.impl;

import com.example.ss1.repository.ICurrencyRepo;
import org.springframework.stereotype.Repository;

@Repository
public class CurrencyRepoImpl implements ICurrencyRepo {
    @Override
    public float convert(float usd) {
        float result = usd* 23000;
        return result;
    }
}

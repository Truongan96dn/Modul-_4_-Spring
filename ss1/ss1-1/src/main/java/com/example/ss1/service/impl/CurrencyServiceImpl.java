package com.example.ss1.service.impl;

import com.example.ss1.repository.ICurrencyRepo;
import com.example.ss1.service.ICurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CurrencyServiceImpl implements ICurrencyService {
    @Autowired
     private ICurrencyRepo iCurrencyRepo ;
    @Override
    public float convert(float usd) {
        return iCurrencyRepo.convert(usd);
    }
}

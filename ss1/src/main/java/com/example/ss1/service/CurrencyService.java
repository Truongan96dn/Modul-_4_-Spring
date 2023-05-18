package com.example.ss1.service;

import com.example.ss1.repository.CurrencyRepo;
import com.example.ss1.repository.ICurrencyRepo;
import org.springframework.stereotype.Service;
@Service
public class CurrencyService implements ICurrencyService{

     private ICurrencyRepo iCurrencyRepo = new CurrencyRepo();
    @Override
    public float convert(float usd) {
        return iCurrencyRepo.convert(usd);
    }
}

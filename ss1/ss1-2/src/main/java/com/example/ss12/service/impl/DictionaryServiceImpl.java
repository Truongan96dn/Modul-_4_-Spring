package com.example.ss12.service.impl;

import com.example.ss12.repository.impl.DictionaryRepoImpl;
import com.example.ss12.repository.IDictionaryRepo;
import com.example.ss12.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {
    @Autowired
    private IDictionaryRepo iDictionaryRepo ;
    @Override
    public String translate(String word) {
        return iDictionaryRepo.translate(word);
    }
}

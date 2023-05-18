package com.example.ss1.service;

import com.example.ss1.repository.DictionaryRepo;
import com.example.ss1.repository.IDictionaryRepo;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{
    private IDictionaryRepo iDictionaryRepo = new DictionaryRepo();
    @Override
    public String translate(String word) {
        return iDictionaryRepo.translate(word);
    }
}

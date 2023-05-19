package com.example.ss12.repository.impl;

import com.example.ss12.repository.IDictionaryRepo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository

public class DictionaryRepoImpl implements IDictionaryRepo {
    @Override
    public String translate(String word) {
        Map<String,String> stringMap =new HashMap<>();
        stringMap.put("egg","trứng");
        stringMap.put("orange","quả cam");
        stringMap.put("apple","quả táo");
        stringMap.put("snake","con rắn");
        stringMap.put("pain","cơn đau");
        stringMap.put("healthy","khoẻ mạnh");
        stringMap.put("weak","yếu ớt");
        return  stringMap.get(word);
    }
}

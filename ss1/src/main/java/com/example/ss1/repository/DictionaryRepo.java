package com.example.ss1.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryRepo implements IDictionaryRepo{
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
        Set<String> strings = stringMap.keySet();
        for ( String e : strings ) {
            if(word.equals(e)){
                return stringMap.get(e);
            }
        }return " word not found";
    }
}

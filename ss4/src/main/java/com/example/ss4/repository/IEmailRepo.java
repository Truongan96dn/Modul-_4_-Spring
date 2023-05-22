package com.example.ss4.repository;

import com.example.ss4.model.Email;

import java.util.List;

public interface IEmailRepo {
    List<String> getLanguage();

    List<Integer> getPageSize();

    Email getEmail();

    void update(Email email);
}

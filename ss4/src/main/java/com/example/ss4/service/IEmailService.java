package com.example.ss4.service;

import com.example.ss4.model.Email;

import java.util.List;

public interface IEmailService {
    List<String> getLanguages();
    List<Integer> getPageSize();
    Email getEmail();
    void update(Email email);
}

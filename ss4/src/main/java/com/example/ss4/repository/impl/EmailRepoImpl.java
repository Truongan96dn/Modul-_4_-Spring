package com.example.ss4.repository.impl;

import com.example.ss4.model.Email;
import com.example.ss4.repository.IEmailRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmailRepoImpl implements IEmailRepo {
    private Email email = new Email("English",5,"","Thor");
    private static List<String> listLanguage = new ArrayList<>();
    static {
        listLanguage.add("English");
        listLanguage.add("Vietnamese");
        listLanguage.add("Japanese");
        listLanguage.add("Chinese");
    }
    private static List<Integer> listPageSize = new ArrayList<>();
    static {
        listPageSize.add(5);
        listPageSize.add(10);
        listPageSize.add(15);
        listPageSize.add(25);
        listPageSize.add(50);
        listPageSize.add(100);
    }
    @Override
    public List<String> getLanguage() {
        return listLanguage;
    }

    @Override
    public List<Integer> getPageSize() {
        return listPageSize;
    }

    @Override
    public Email getEmail() {
        return email;
    }

    @Override
    public void update(Email email) {
        this.email = email;
    }
}

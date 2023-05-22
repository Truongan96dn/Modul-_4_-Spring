package com.example.ss4.service.impl;

import com.example.ss4.model.Email;
import com.example.ss4.repository.IEmailRepo;
import com.example.ss4.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmailServiceImpl implements IEmailService {
    @Autowired
    private IEmailRepo iEmailRepo;

    @Override
    public List<String> getLanguages() {
        return iEmailRepo.getLanguage();
    }

    @Override
    public List<Integer> getPageSize() {
        return iEmailRepo.getPageSize();
    }

    @Override
    public Email getEmail() {
        return iEmailRepo.getEmail();
    }

    @Override
    public void update(Email email) {
        iEmailRepo.update(email);
    }
}

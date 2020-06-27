package com.hcmut.scrum.service.impl;


import com.hcmut.scrum.model.Account;
import com.hcmut.scrum.repository.AccountRepository;
import com.hcmut.scrum.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements  AccountService {


    private AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl (AccountRepository productRepository){
        this.accountRepository = productRepository;
    }

    @Override
    public List<Account> findAllAccount() {
        return (List<Account>) accountRepository.findAll();
    }
}


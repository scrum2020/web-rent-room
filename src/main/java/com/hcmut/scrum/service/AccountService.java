package com.hcmut.scrum.service;

import com.hcmut.scrum.model.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountService {
    List<Account> findAllAccount();

}


package com.nuntius.account.service;

import com.nuntius.account.client.AuthServiceClient;
import com.nuntius.account.domain.Account;
import com.nuntius.account.domain.User;
import com.nuntius.account.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

/**
 * Created by sergiojimenezfemenia on 1/5/17.
 */
public class AccountServiceImpl implements AccountService {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    private AuthServiceClient authClient;

   @Autowired
    private AccountRepository repository;

    @Override
    public Account findByName(String accountName) {
        return repository.findByName(accountName);
    }

    @Override
    public Account create(User user) {
        Account existing = repository.findByName(user.getUsername());
        Assert.isNull(existing, "account already exists: " + user.getUsername());

        authClient.createUser(user);

        Account account = new Account();
        account.setName(user.getUsername());
        repository.save(account);

        log.info("new account has been created: " + account.getName());

        return account;

    }

    @Override
    public void saveChanges(String name, Account update) {

        Account account = repository.findByName(name);
        Assert.notNull(account, "can't find account with name " + name);

        repository.save(account);

        log.debug("account {} changes has been saved", name);
    }



}

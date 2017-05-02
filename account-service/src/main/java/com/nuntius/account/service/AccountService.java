package com.nuntius.account.service;

import com.nuntius.account.domain.Account;
import com.nuntius.account.domain.User;

/**
 * Created by sergiojimenezfemenia on 1/5/17.
 */
public interface AccountService {

    Account findByName(String accountName);
    Account create(User user);
    void saveChanges(String name, Account update);
}

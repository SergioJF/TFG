package com.nuntius.account.repository;


import com.nuntius.account.AccountServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = AccountServiceApplication.class)
public class AccountRepositoryTest {

    @Autowired
    private AccountServiceApplication repository;

    @Test
    public void shouldFindAccountByName() {

        assertEquals(1, 1);
    }
}
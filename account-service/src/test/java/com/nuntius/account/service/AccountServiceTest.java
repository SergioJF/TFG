package com.nuntius.account.service;


import com.nuntius.account.client.AuthServiceClient;
import com.nuntius.account.domain.*;
import com.nuntius.account.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class AccountServiceTest {

    @InjectMocks
    private AccountServiceImpl accountService;


    @Mock
    private AuthServiceClient authClient;

    @Mock
    private AccountRepository repository;

    @Before
    public void setup() {
        initMocks(this);
    }

    @Test
    public void shouldFindByName() {

        final Account account = new Account();
        account.setName("test");

        when(accountService.findByName(account.getName())).thenReturn(account);
        Account found = accountService.findByName(account.getName());

        assertEquals(account, found);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldFailWhenNameIsEmpty() {
        accountService.findByName("");
    }

}
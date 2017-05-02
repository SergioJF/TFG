package com.nuntius.account.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by sergiojimenezfemenia on 1/5/17.
 */

@Document(collection = "accounts")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {


    @Id
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

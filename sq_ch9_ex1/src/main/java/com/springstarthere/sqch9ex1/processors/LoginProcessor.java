package com.springstarthere.sqch9ex1.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class LoginProcessor {
    private String username;
    private String password;

    public boolean login() {
        String password = this.getPassword();
        String username = this.getUsername();
        if ("niki".equals(username) && "1234".equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public LoginProcessor setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginProcessor setPassword(String password) {
        this.password = password;
        return this;
    }
}

package com.springstarthere.sqch9ex6.services;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class LoggedUserManagementService {
    private String username;

    public String getUsername() {
        return username;
    }

    public LoggedUserManagementService setUsername(String username) {
        this.username = username;
        return this;
    }
}

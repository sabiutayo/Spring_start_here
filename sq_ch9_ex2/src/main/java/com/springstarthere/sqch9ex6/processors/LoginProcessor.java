package com.springstarthere.sqch9ex6.processors;

import com.springstarthere.sqch9ex6.services.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class LoginProcessor {
    private String username;
    private String password;

    private  final LoggedUserManagementService loggedUserManagementService;

    public LoginProcessor(LoggedUserManagementService loggedUserManagementService) {
        this.loggedUserManagementService = loggedUserManagementService;
    }

    public boolean login() {
        String password = this.getPassword();
        String username = this.getUsername();

        boolean loginResult = false;

        if ("niki".equals(username) && "1234".equals(password)) {
            loginResult = true;
            loggedUserManagementService.setUsername(username);
        }
            return loginResult;
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

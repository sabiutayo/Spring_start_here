package com.springstarthere.sqch9ex3.processors;

import com.springstarthere.sqch9ex3.services.LoggedUserManagementService;
import com.springstarthere.sqch9ex3.services.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Component
public class LoginProcessor {
    private String username;
    private String password;

    private  final LoggedUserManagementService loggedUserManagementService;
    private final LoginCountService loginCountService;
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean login() {
        loginCountService.increment();
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

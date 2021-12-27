package com.springstarthere.sqch9ex6.controllers;

import com.springstarthere.sqch9ex6.processors.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    public final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet() {

        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(Model model,
                            @RequestParam String username,
                            @RequestParam String password) {
        boolean isLoggedIn = loginProcessor.setUsername(username).setPassword(password).login();

        if (isLoggedIn) {
            return "redirect:/main";
        }
        model.addAttribute("message", "Login failed!");
        return "login.html";
    }
}

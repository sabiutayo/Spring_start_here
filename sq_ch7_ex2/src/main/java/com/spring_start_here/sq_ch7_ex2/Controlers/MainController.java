package com.spring_start_here.sq_ch7_ex2.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
@RequestMapping("/home")
    public String home(Model page, @RequestParam String color, @RequestParam String username){
        page.addAttribute("username",username);
        page.addAttribute("color", color);
        return "home.html";
    }
}

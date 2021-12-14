package com.spring_start_here.sq_ch7_ex1.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
@RequestMapping("/home")
    public String home(){
        return "home.html";
    }
}

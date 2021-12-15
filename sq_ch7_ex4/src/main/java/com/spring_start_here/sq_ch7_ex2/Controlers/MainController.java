package com.spring_start_here.sq_ch7_ex2.Controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
@RequestMapping("/home/{color}")
    public String home(Model page, @PathVariable String color){
        page.addAttribute("username","Katy");
        page.addAttribute("color", color);
        return "home.html";
    }
}

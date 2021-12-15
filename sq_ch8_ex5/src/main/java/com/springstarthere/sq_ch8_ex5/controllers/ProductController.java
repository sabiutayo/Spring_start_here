package com.springstarthere.sq_ch8_ex5.controllers;

import com.springstarthere.sq_ch8_ex5.model.Product;
import com.springstarthere.sq_ch8_ex5.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/products",method = {RequestMethod.GET})
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute(products);
       return "products.html";
    }

}

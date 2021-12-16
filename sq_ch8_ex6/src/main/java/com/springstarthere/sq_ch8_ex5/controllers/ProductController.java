package com.springstarthere.sq_ch8_ex5.controllers;

import com.springstarthere.sq_ch8_ex5.model.Product;
import com.springstarthere.sq_ch8_ex5.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute(products);
        return "products.html";
    }

    @PostMapping(path = "/products")
    public String addProduct( Product product,
                             Model model){
                productService.addProduct(product);
        model.addAttribute("products",productService.findAll());
        return "products.html";
    }

}

package com.example.spring.controller;

import com.example.spring.model.Product;
import com.example.spring.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {
    private final ProductService productService;


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewAll(Model model){
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @Controller
    public class ProductsController {
        // остальной код
        @PostMapping("/products")
        public String addProduct(
                Product p,
                Model model
        ) {
            productService.addProduct(p);
            var products = productService.findAll();
            model.addAttribute("products", products);
            return "products.html";
        }
    }
}

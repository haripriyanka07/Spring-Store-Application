package com.ecommerce.store.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class LoginController {

    @GetMapping("/")
    public String home(){
        return "dashboard";
    }
    
    

}

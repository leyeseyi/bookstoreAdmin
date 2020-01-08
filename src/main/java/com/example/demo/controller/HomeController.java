/*
 * ADMIN HOME CONTROLLER
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Leyeseyi
 */
@Controller
public class HomeController {
    
    @RequestMapping("/")
    public String index(){
        return "redirect:/home";
    }
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}

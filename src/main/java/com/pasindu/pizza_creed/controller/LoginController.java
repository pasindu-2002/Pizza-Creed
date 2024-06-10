package com.pasindu.pizza_creed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private final static String USERNAME = "admin";
    private final static String PASSWORD = "$2a$12$186K5OlBANk87m9Dd4hlxewhlJ5ICxthXIqQhdrDxHOxq4tNx8FTu";

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String showHome(){
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
    @PostMapping("/login")
    public String login(String username, String password, Model model){
        if (username.equals(USERNAME) && passwordEncoder.matches(password, PASSWORD)) {
            // Authentication successful
            model.addAttribute("username", username);
            return "redirect:/admin/pizza/";
        } else {
            // Authentication failed
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }
}

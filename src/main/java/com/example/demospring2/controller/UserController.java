package com.example.demospring2.controller;

import com.example.demospring2.model.User;
import com.example.demospring2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String viewAllUsers(Model model){
        model.addAttribute("users_list", userService.findAll());
        return "users";
    }

    @GetMapping("/reg")
    public String regForm(Model model){
        model.addAttribute("user", new User());
        return "reg";
    }

    @PostMapping("/reg")
    public String regSubmit(@ModelAttribute User user){
        userService.save(user);
        return "redirect:/users";
    }
}

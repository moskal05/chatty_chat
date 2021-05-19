package com.example.restservice;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final String template = "Главная страница";

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title",template);
        return "home";
    }
}
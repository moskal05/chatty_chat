package com.example.restservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String about(Model model) throws UnknownHostException {
        model.addAttribute("about", "you go to page ABOUT");
        return "about";
    }
}

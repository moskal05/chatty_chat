package com.example.restservice;



import org.springframework.stereotype.Controller ;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class MainController {


    @GetMapping("/")
    public String home(Model model) throws UnknownHostException {
        model.addAttribute("title",InetAddress.getLocalHost().getHostName());
        return "home";
    }

    @GetMapping("/hello")
    @ResponseBody//Аннотация @ResponseBody дает фреймворку понять, что объект, который вы вернули из метода надо
    // прогнать через HttpMessageConverter, чтобы получить готовое к отправке на клиент представление.
    public String hello() {
        return "hello";
    }
}
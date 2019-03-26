package ru.itis.sc2.lesson12;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/app")
    public String main() {
        return "name";
    }

    @RequestMapping("/app/hello")
    public String greeting(Model model,
                           @RequestParam String username) {
        model.addAttribute("username", username);
        return "greeting";
    }

    @RequestMapping("/")
    public String index() {
        UserService us = new UserService();
        return us.getAllUsers();
    }

}
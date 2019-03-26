package ru.itis.sc2.lesson12;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class HelloController {

    @RequestMapping("/")
    public String index() {
        UserService us = new UserService();
        return us.getAllUsers();
    }

    @RequestMapping("/bye")
    public String goodBye() {
        return "<form>" +
                "   <input type=\"text\"> " +
                "</form>";
    }
}
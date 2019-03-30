package ru.itis.sc2.lesson13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.sc2.lesson13.dao.UserDao;
import ru.itis.sc2.lesson13.models.User;

@Controller
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping("/user")
    public String getUserById(Model model,
                              @RequestParam Integer id) {
        User u = userDao.find(id);
        model.addAttribute("user", u);
        return "user_page";
    }
}

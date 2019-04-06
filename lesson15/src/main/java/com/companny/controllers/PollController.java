package com.companny.controllers;

import com.companny.dao.PollDao;
import com.companny.models.Poll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PollController {
    @Autowired
    PollDao pollDao;

    @GetMapping("/")
    String allPolls(Model model) {
        List<Poll> allPolls = pollDao.findAll();
        model.addAttribute("pollList", allPolls);
        return "all_polls_page";
    }
}

package com.companny.controllers;

import com.companny.dao.OptionDao;
import com.companny.dao.PollDao;
import com.companny.models.Option;
import com.companny.models.Poll;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PollController {
    @Autowired
    PollDao pollDao;

    @Autowired
    OptionDao optionDao;

    @GetMapping("/vote")
    String vote(Integer optionId) {
        optionDao.addVote(optionId);
        return "redirect:/";
    }

    @GetMapping("/options")
    String getOptions(Model model,
                      @RequestParam Integer pollId) {
        List<Option> options =
            optionDao.findOptionsByPollId(pollId);
        model.addAttribute("optionList", options);
        return "options_page";
    }

    @GetMapping("/")
    String allPolls(Model model) {
        List<Poll> allPolls = pollDao.findAll();
        model.addAttribute("pollList", allPolls);
        return "all_polls_page";
    }
}

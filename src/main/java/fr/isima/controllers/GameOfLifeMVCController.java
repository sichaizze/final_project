package fr.isima.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/gameoflife")
public class GameOfLifeMVCController {

    @GetMapping
    public ModelAndView grid() {
        return new ModelAndView("GameofLife");
    }
}

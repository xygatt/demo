package com.example.demo.welcome;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Slf4j
@Controller
public class WelcomeController {
    @RequestMapping("test")
    String test(Model model){
        log.info("welcome controller");
        model.addAttribute("value", "welcome test");
        return "welcome";
    }
}

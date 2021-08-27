package com.damlabin.springsecurity.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by francis on 12/8/20.
 */
@Controller
public class ClientForward {

    @GetMapping(value = "/")
    public String forward() {
        return "redirect:swagger-ui.html";
    }
}

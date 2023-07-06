package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PageController {
    @GetMapping("/info")
    public String getInfo() {
        System.out.println("information page");
        return "information";
    }
}

package org.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/main")
    public String mainMethod(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
//        model.addAttribute("name", name);
        return "Hello" + name;
    }
}

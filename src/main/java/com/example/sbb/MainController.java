package com.example.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    // GET http://localhost:8080/
    @GetMapping("/")
    public void home() {
        System.out.println("반갑다 어서오고");
        this.contact();
    }

    // GET http://localhost:8080/about
    @GetMapping("/about")
    public void about() {
        System.out.println("about");
        this.contact();
    }

    public void contact() {
        System.out.println("contact");
    }
}

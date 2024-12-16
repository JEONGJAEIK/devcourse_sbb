package com.example.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    // GET http://localhost:8080/
    @GetMapping("/sbb")
    @ResponseBody
    public String index() {
        return "하이";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}

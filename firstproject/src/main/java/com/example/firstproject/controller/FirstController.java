package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String niceToMeetYou(Model _model){
        // 변수 전달
        _model.addAttribute("username", "연습");
        // templates/greetings.mustache -> 브라우저로 전송
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYouNext(Model _model){
        // 변수 전달
        _model.addAttribute("nickname", "たろ");
        // templates/greetings.mustache -> 브라우저로 전송
        return "goodbye";
    }
}

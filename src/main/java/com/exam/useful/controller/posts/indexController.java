package com.exam.useful.controller.posts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
}

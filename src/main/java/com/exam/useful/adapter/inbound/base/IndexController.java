package com.exam.useful.adapter.inbound.base;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
}

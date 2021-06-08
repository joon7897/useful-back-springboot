package com.exam.useful.adapter.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/view")
@Controller
public class viewController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }
    @GetMapping("/accessDenied")
    public String accessDenied(){
        return "accessDenied";
    }
    @GetMapping("/user")
    public String user(){
        return "user";
    }
    @GetMapping("/manager")
    public String manager(){
        return "manager";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

}

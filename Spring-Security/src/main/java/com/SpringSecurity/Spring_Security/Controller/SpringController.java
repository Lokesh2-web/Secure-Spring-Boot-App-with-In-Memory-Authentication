package com.SpringSecurity.Spring_Security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class SpringController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/user")
    public String user() {
        return "\uD83D\uDC64 User Page (LOGIN REQUIRED)";
    }
    @GetMapping("/admin")
    public String adminPage(){
        return "\uD83D\uDD10 Admin Page (ROLE_ADMIN ONLY)";
    }

}

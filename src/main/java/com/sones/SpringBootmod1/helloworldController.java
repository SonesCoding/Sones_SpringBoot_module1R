package com.sones.SpringBootmod1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloworldController {

    @GetMapping("/")
    public String Showhome(){
        return "home";
    }

     @GetMapping("message.html")
    public String Showmessage(){
        return "message";
    }
}

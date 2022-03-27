package danila.springvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @GetMapping("/hello")
    public String hello () {
        return "Full Stack Java Development with Spring Boot and Vue.js";
    }
}

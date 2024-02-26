package com.hyukggun.EZHealthCollector;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StepController {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }
    
    @GetMapping("/step")
    public String step() {
        return "Step";
    }
}
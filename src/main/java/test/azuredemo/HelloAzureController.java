package test.azuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAzureController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello Azure";
    }
}

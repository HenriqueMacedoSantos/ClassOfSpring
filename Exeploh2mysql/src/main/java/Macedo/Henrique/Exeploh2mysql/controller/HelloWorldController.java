package Macedo.Henrique.Exeploh2mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Henrique Macedo Santos
 * @since 23/04/2020 07:48 AM
 * @version 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Welcome to the system";
    }
}

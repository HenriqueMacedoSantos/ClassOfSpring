package Macedo.Henrique.projFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Henrique Macedo Santos
 * @since 25/04/2020 8:28 PM
 * @version 1.0
 */
@RestController
public class IndexController {

    @GetMapping
    public String index(){return "Welcome to the wizard register"; }
}

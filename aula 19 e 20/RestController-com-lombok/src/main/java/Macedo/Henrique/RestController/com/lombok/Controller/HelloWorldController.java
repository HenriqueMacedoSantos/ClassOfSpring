package Macedo.Henrique.RestController.com.lombok.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Henrique Macedo
 * @since 15/04/2020 7:21PM
 * @version 1.0
 */
@RestController
public class HelloWorldController {
    /**
     *
     * @return the index off aplication
     */
    @GetMapping("/")
    public String Index(){
        return "index mais que brabo";
    }
}

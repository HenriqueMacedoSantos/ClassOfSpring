package Macedo.Henrique.dependencyInjector;

import Macedo.Henrique.dependencyInjector.Interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:12
 * @version 1.0
 */
@Component
public class Pet {

    @Autowired
    @Qualifier("dog")
    private IAnimal iAnimal;

    public void execute() {
        iAnimal.communicate();
    }

}
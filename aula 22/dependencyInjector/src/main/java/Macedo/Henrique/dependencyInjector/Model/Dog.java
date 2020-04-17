package Macedo.Henrique.dependencyInjector.Model;

import Macedo.Henrique.dependencyInjector.Interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:07
 * @version 1.0
 */
@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void communicate() {
        System.out.println("AU AU AU AU AU AU UUUUUUU");
    }
}

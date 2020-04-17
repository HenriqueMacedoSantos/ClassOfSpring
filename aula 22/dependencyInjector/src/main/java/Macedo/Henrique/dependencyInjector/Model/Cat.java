package Macedo.Henrique.dependencyInjector.Model;

import Macedo.Henrique.dependencyInjector.Interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:05
 * @version 1.0
 */
@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void communicate() {
        System.out.println("MIAU MIAU AU AU AU AU");
    }
}
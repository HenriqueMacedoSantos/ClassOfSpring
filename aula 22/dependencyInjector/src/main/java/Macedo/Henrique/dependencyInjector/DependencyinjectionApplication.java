package Macedo.Henrique.dependencyInjector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:14
 * @version 1.0
 */
@SpringBootApplication
public class DependencyinjectionApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DependencyinjectionApplication.class, args);

        Pet pet = applicationContext.getBean(Pet.class);
        pet.execute();
    }

}


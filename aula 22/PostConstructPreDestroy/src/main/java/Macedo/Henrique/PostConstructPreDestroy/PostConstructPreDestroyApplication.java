package Macedo.Henrique.PostConstructPreDestroy;

import Macedo.Henrique.PostConstructPreDestroy.DAO.ClientDAO;
import Macedo.Henrique.PostConstructPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:36
 * @version 1.0
 */
@SpringBootApplication
public class PostConstructPreDestroyApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(PostConstructPreDestroyApplication.class, args);

        ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

        clientDAO.setClient(new Client("Henrique"));

        System.out.println("objeto ClientDAO: " + clientDAO);
        System.out.println("objeto cliente: " + clientDAO.getClient());
    }
}

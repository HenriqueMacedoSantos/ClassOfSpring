package Macedo.Henrique.PostConstructPreDestroy.DAO;

import ch.qos.logback.core.net.server.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:27
 * @version 1.0
 */
@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;


    @PostConstruct
    public void postConstructor() {
        System.out.println("Object created!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("finished object!");
    }
}

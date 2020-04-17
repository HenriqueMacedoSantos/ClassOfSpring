package Macedo.Henrique.PostConstructPreDestroy.model;

import lombok.*;

import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 22:30
 * @version 1.0
 */
@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public  Client() {
        System.out.println("Client class!");
    }
}

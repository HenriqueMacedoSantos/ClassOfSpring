package Macedo.Henrique.Exeploh2mysql.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Henrique Macedo Santos
 * @since 23/04/2020 07:42 AM
 * @version 1.0
 */
@Component

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "Client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private long id;

    @Column(name = "name")
    private long name;

    @Column(name = "income")
    private long income;
}
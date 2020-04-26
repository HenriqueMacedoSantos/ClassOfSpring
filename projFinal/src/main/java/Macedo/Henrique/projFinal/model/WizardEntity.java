package Macedo.Henrique.projFinal.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author Henrique Macedo Santos
 * @since 25/04/2020 8:17 PM
 * @version 1.0
 */
@Component
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "Wizard")
public class WizardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GWR")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "house")
    private String house;

    @Column(name = "age")
    private long age;

    @Column(name = "patron")
    private String patron;

    @Column(name = "animal")
    private String animal;

    @Column(name = "wand")
    private String wand;
}

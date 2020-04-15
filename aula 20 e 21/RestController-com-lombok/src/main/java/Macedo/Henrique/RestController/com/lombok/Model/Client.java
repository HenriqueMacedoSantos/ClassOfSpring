package Macedo.Henrique.RestController.com.lombok.Model;

import lombok.*;

/**
 * @author Henrique Macedo
 * @since 15/04/2020 7:42PM
 * @version 1.0
 */

@NoArgsConstructor@AllArgsConstructor
@Getter@Setter
@ToString
public class Client {
    private String nome;
    private int idade;
    private String email;
}

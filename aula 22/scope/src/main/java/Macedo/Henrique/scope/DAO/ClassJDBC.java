package Macedo.Henrique.scope.DAO;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 23:07
 * @version 1.0
 */

@Component
@Scope
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Classe JDBC!");
    }
}

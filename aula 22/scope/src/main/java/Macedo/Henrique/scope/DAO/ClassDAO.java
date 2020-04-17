package Macedo.Henrique.scope.DAO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 23:04
 * @version 1.0
 */

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Getter
@Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}

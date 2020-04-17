package Macedo.Henrique.scope;

import Macedo.Henrique.scope.DAO.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Henrique Macedo Santos
 * @since 16/04/2020 23:08
 * @version 1.0
 */
@SpringBootApplication
public class ScopeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext  = SpringApplication.run(ScopeApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " + objectDAO2);
		System.out.println("Objeto JDBC: " + objectDAO2.getObjectJDBC());
	}

}

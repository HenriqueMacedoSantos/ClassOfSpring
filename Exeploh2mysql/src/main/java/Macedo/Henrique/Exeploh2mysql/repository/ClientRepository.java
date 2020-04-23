package Macedo.Henrique.Exeploh2mysql.repository;

import Macedo.Henrique.Exeploh2mysql.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Henrique Macedo Santos
 * @since 23/04/2020 07:43 AM
 * @version 1.0
 */
@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
}

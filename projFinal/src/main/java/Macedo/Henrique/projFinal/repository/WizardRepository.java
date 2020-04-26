package Macedo.Henrique.projFinal.repository;

import Macedo.Henrique.projFinal.model.WizardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Henrique Macedo Santos
 * @since 25/04/2020 8:34 PM
 * @version 1.0
 */
@Repository
public interface WizardRepository extends CrudRepository<WizardEntity, Long> {
}

package application.repo;


import application.models.ZarriFoodModel;
import org.springframework.data.repository.CrudRepository;

public interface ZarriFoodRepo extends CrudRepository<ZarriFoodModel,Long> {

}

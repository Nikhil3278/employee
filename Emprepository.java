package repository;
import model.Emprequest;
import org.springframework.data.repository.CrudRepository;


public interface Emprepository  extends CrudRepository<Emprequest, Integer>
    {

    }


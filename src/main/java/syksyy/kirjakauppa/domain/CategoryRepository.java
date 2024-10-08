package syksyy.kirjakauppa.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
    List<Category> findByName(String name);
}

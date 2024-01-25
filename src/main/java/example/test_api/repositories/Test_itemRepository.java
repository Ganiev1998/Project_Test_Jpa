package example.test_api.repositories;

import example.test_api.entities.Test_item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Test_itemRepository extends JpaRepository<Test_item,Long> {
}

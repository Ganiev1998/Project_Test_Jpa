package example.test_api.repositories;

import example.test_api.entities.Tech;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechRepository extends JpaRepository<Tech,Long> {
    Tech getReferenceById(Integer id);
}

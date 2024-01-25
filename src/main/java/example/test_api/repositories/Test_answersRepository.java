package example.test_api.repositories;

import example.test_api.entities.Test_Answers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Test_answersRepository extends JpaRepository<Test_Answers,Long> {
}

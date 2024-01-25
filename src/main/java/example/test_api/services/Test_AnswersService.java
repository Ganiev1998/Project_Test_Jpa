package example.test_api.services;

import example.test_api.dtos.requestDto.Test_answerRequestDTO;
import example.test_api.dtos.responseDto.Test_AnswersDTO;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface Test_AnswersService {
    Test_AnswersDTO getById(Integer id);
    List<Test_AnswersDTO> getAll();
    Test_AnswersDTO insert(Test_answerRequestDTO testAnswerRequestDTO);
    Test_AnswersDTO update(Integer id,Test_answerRequestDTO testAnswerRequestDTO);
    void delete(Integer id);
}

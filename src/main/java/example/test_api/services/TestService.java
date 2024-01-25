package example.test_api.services;

import example.test_api.dtos.requestDto.TestReauestDTO;
import example.test_api.dtos.responseDto.TestDTO;

import java.util.List;

public interface TestService {
    TestDTO getById(Integer id);
    List<TestDTO> getAll();
    TestDTO insert(TestReauestDTO testReauestDTO);
    TestDTO update(Integer id,TestReauestDTO testReauestDTO);
    void delete(Integer id);
}

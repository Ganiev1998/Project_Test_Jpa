package example.test_api.services.impl;

import example.test_api.dtos.requestDto.TestReauestDTO;
import example.test_api.dtos.responseDto.TestDTO;
import example.test_api.entities.Tech;
import example.test_api.entities.Test;
import example.test_api.repositories.TechRepository;
import example.test_api.repositories.TestRepository;
import example.test_api.services.TestService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TestServiceimpl implements TestService {
    private final TestRepository testRepository;
    private final TechRepository techRepository;

    public TestServiceimpl(TestRepository testRepository, TechRepository techRepository) {
        this.testRepository = testRepository;
        this.techRepository = techRepository;
    }

    @Override
    public TestDTO getById(Integer id) {
        return testRepository.getReferenceById(Long.valueOf(id)).toDTO();
    }

    @Override
    public List<TestDTO> getAll() {
        return testRepository.findAll().stream().map(Test::toDTO).collect(Collectors.toList());
    }

    @Override
    public TestDTO insert(TestReauestDTO testReauestDTO) {
        Test test = new Test();
        test.setTitle(testReauestDTO.getTitle());
        Tech tech = techRepository.getReferenceById(testReauestDTO.getTech_id());
        test.setTech(tech);
        Test test1 = testRepository.save(test);
        return test1.toDTO();
    }

    @Override
    public TestDTO update(Integer id, TestReauestDTO testReauestDTO) {
        Test test = testRepository.getReferenceById(Long.valueOf(id));
        test.setTitle(testReauestDTO.getTitle());
        test.setTech(testReauestDTO.getTech_id());
        return testRepository.save(test).toDTO();
    }

    @Override
    public void delete(Integer id) {
        testRepository.deleteById(Long.valueOf(id));
    }
}

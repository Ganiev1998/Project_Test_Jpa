package example.test_api.controllers;

import example.test_api.dtos.requestDto.TestReauestDTO;
import example.test_api.dtos.responseDto.TechDTO;
import example.test_api.dtos.responseDto.TestDTO;
import example.test_api.services.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @GetMapping("/{id}")
    public TestDTO getById(@PathVariable Integer id){
        return testService.getById(id);
    }
    @GetMapping
    public List<TestDTO> getAll(){
        return testService.getAll();
    }
    @PostMapping
    public TestDTO create(@RequestBody TestReauestDTO testReauestDTO){
         return testService.insert(testReauestDTO);
    }
    @PutMapping("/{id}")
    public TestDTO update(@PathVariable Integer id,@RequestBody TestReauestDTO testReauestDTO){
        return testService.update(id,testReauestDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        testService.delete(id);
    }
}

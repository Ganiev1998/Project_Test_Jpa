package example.test_api.controllers;

import example.test_api.dtos.requestDto.TechRequestDTO;
import example.test_api.dtos.responseDto.TechDTO;
import example.test_api.services.TechService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tech")
public class TechController {
    private final TechService techService;

    public TechController(TechService techService) {
        this.techService = techService;
    }

    @GetMapping
    public List<TechDTO> getAll(){
        return techService.getAll();
    }
    @GetMapping("/{id}")
    public TechDTO getById(@PathVariable("id")Integer id){
        return techService.getById(id);
    }
    @PostMapping
    public TechDTO create(@RequestBody TechRequestDTO techRequestDTO){
        return techService.insert(techRequestDTO);
    }
    @PutMapping("/{id}")
    public TechDTO update(@PathVariable("id")Integer id,@RequestBody TechRequestDTO techRequestDTO){
        return techService.update(id,techRequestDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Integer id){
        techService.delete(id);
    }
}

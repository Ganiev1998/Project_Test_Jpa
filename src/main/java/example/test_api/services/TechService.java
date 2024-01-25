package example.test_api.services;

import example.test_api.dtos.requestDto.TechRequestDTO;
import example.test_api.dtos.responseDto.TechDTO;
import example.test_api.entities.Tech;

import java.util.List;

public interface TechService {
    List<TechDTO> getAll();
    TechDTO getById(Integer id);
    TechDTO insert(TechRequestDTO techRequestDTO);
    TechDTO update(Integer id,TechRequestDTO techRequestDTO);
    void delete(Integer id);
    //TechDTO toDTO(Tech tech);
}

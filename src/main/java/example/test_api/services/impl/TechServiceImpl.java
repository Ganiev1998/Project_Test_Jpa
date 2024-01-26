package example.test_api.services.impl;

import example.test_api.dtos.requestDto.TechRequestDTO;
import example.test_api.dtos.responseDto.TechDTO;
import example.test_api.entities.Tech;
import example.test_api.repositories.TechRepository;
import example.test_api.services.TechService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TechServiceImpl implements TechService {
    private final TechRepository techRepository;

    public TechServiceImpl(TechRepository techRepository) {
        this.techRepository = techRepository;
    }

    @Override
    public List<TechDTO> getAll() {
        return techRepository.findAll().stream().map(Tech::toDTO).collect(Collectors.toList());
    }

    @Override
    public TechDTO getById(Integer id) {
        return techRepository.getReferenceById(Long.valueOf(id)).toDTO();
    }

    @Override
    public TechDTO insert(TechRequestDTO techRequestDTO) {
        Tech tech = new Tech();
        tech.setName(techRequestDTO.getName());
        techRepository.save(tech);
        return (tech).toDTO();
    }

    @Override
    public TechDTO update(Integer id, TechRequestDTO techRequestDTO) {
        Tech tech = techRepository.getReferenceById(Long.valueOf(id));
        tech.setName(techRequestDTO.getName());
        return techRepository.save(tech).toDTO();
    }

    @Override
    public void delete(Integer id) {
        techRepository.deleteById(Long.valueOf(id));
    }

//    @Override
//    public TechDTO toDTO(Tech tech) {
//        TechDTO dto = new TechDTO();
//        dto.setId(tech.getId());
//        dto.setName(tech.getName());
//        return dto;
//    }
}

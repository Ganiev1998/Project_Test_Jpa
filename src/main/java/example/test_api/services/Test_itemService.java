package example.test_api.services;

import example.test_api.dtos.requestDto.TestReauestDTO;
import example.test_api.dtos.requestDto.Test_ItemRequestDTO;
import example.test_api.dtos.responseDto.Test_ItemDTO;

import java.util.List;

public interface Test_itemService {
    Test_ItemDTO getById(Integer id);
    List<Test_ItemDTO> getAll();
    Test_ItemDTO insert(Test_ItemRequestDTO testItemRequestDTO);
    Test_ItemDTO update(Integer id,Test_ItemRequestDTO testItemRequestDTO);
    void delete(Integer id);
}

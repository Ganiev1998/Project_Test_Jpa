package example.test_api.dtos.requestDto;

import example.test_api.dtos.responseDto.TechDTO;
import example.test_api.entities.Tech;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestReauestDTO {
    private String title;
    private TechDTO tech_id;

}

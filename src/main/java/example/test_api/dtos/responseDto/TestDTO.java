package example.test_api.dtos.responseDto;

import example.test_api.entities.Tech;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TestDTO {
    private Long id;
    private String title;
    private Tech tech;
}

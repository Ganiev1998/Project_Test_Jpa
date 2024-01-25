package example.test_api.dtos.requestDto;

import example.test_api.dtos.responseDto.TestDTO;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test_ItemRequestDTO {
    private TestDTO test_id;
    private String question_task;
}

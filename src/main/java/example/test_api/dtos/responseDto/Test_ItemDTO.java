package example.test_api.dtos.responseDto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test_ItemDTO {
    private Long id;
    private Long test_id;
    private String question_task;
}

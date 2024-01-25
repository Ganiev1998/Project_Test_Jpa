package example.test_api.dtos.responseDto;

import example.test_api.entities.Test;
import example.test_api.entities.Test_item;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test_AnswersDTO {
    private Long id;
    private Test_item test_item_id;
    private Test test_id;
    private String answer;
    private Integer order;
    private boolean isCorrect;

}

package example.test_api.dtos.requestDto;

import example.test_api.entities.Test;
import example.test_api.entities.Test_Answers;
import example.test_api.entities.Test_item;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Test_answerRequestDTO {
    private Test_item test_item_id;
    private Test test_id;
    private String answer;
    private Integer order;
    private boolean isCorrect;
}

package example.test_api.entities;

import example.test_api.dtos.responseDto.Test_AnswersDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test_Answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Test_item test_item_id;
    @ManyToOne
    private Test test_id;
    private String answer;
    private Integer order;
    private boolean isCorrect;
    public Test_AnswersDTO toDTO(){
        return new Test_AnswersDTO(this.id,this.test_item_id,this.test_id,this.answer,this.order,this.isCorrect);
    }
}

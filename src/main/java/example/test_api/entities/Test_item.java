package example.test_api.entities;

import example.test_api.dtos.responseDto.Test_ItemDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test_item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long test_id;
    private String question_task;
    public Test_ItemDTO toDTO(){
        return new Test_ItemDTO(this.id,this.test_id,this.question_task);
    }
}

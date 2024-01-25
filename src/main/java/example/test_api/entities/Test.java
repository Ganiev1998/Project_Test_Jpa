package example.test_api.entities;

import example.test_api.dtos.responseDto.TestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Tech tech;
    public TestDTO toDTO(){
        return new TestDTO(this.id,this.title,this.tech);
    }

    public void setTech(Integer techId) {
    }

    public void setTech(Tech tech) {
    }
}

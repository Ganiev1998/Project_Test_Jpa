package example.test_api.entities;

import example.test_api.dtos.responseDto.TechDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Tech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "tech")
    private List<Test> list;
    public TechDTO toDTO(){
        return new TechDTO(this.id,this.name);
    }

}

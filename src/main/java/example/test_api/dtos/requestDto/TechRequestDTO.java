package example.test_api.dtos.requestDto;

import example.test_api.entities.Tech;
import jdk.jfr.Name;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TechRequestDTO {
    private String name;
    public Tech toTech(){
        return Tech.builder().name(this.name).build();
    }
}

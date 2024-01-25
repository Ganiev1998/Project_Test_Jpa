package example.test_api.dtos.responseDto;

import jakarta.persistence.GeneratedValue;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TechDTO {
    private Long id;
    private String name;

}

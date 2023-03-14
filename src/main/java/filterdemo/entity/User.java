package filterdemo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Builder
@Data
@Document
public class User {
    /*@Id
    private int id;*/
    private String firstName;
    private String lastName;
    private String email;
}

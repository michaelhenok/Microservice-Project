package purchase.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "students")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    private String studentNumber;
    private String firstName;
    private String lastName;
    private int score;
    private Avatar avatar = new Avatar();
    private List<Reward> rewards = new ArrayList<>();
    private School school;
    private TeachingClass teachingClass;

}

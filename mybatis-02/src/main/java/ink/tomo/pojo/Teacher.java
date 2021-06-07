package ink.tomo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @author
 * @create 2021-06-07 16:04
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}

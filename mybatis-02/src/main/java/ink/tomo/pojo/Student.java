package ink.tomo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author
 * @create 2021-06-07 16:05
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {
    int id;
    String name;
    Teacher teacher;
}

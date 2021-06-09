package ink.tomo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2021-06-08 18:34
 **/
@Data
@Component
public class User {
    @Autowired
    private Cat cat;
    @Value("tomo")
    private String str;
}

package ink.tomo.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author
 * @create 2021-06-07 21:13
 **/
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}

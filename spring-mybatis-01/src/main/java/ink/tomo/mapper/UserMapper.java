package ink.tomo.mapper;

import ink.tomo.pojo.User;

import java.util.List;

/**
 * @author
 * @create 2021-06-09 15:33
 **/
public interface UserMapper {
    List<User> selectUser();
}

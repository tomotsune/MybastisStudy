package ink.tomo.dao;

import ink.tomo.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUserList();

    List<User> getUserLike(String value);

    List<User> getUserByLimit(Map<String, Integer> map);

    User getUserById(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}

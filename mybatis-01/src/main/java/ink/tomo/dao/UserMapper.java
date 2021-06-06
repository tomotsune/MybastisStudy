package ink.tomo.dao;

import ink.tomo.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserLike(String value);
    User getUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}

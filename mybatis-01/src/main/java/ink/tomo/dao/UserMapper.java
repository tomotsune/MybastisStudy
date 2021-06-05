package ink.tomo.dao;

import ink.tomo.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUserById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}

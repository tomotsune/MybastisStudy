package ink.tomo.service;

import org.springframework.stereotype.Component;

/**
 * @author
 * @create 2021-06-09 13:45
 **/
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");

    }

    @Override
    public void update() {
        System.out.println("update");

    }

    @Override
    public void select() {
        System.out.println("select");

    }
}

package tomo.pojo;

import ink.tomo.config.AppConfig;
import ink.tomo.pojo.User;
import lombok.Data;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author
 * @create 2021-06-08 18:34
 **/

public class UserTest {
    @Test
    public void createUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
    @Test
    public void createUser2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.getCat().shout();
    }
    @Test
    public void createUser3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.getCat().shout();
    }
}

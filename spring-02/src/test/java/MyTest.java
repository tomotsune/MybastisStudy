import ink.tomo.service.UserService;
import ink.tomo.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.cert.CertificateParsingException;

/**
 * @author
 * @create 2021-06-09 14:05
 **/
public class MyTest {
    @Test
    public void addLog(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }
}

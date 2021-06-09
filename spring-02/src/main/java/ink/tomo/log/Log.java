package ink.tomo.log;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author
 * @create 2021-06-09 13:48
 **/
public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        assert target != null;
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}

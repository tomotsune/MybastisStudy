package ink.tomo.dao;

import ink.tomo.pojo.Student;
import ink.tomo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author
 * @create 2021-06-07 18:13
 **/
public class StudentMapperTest {
    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getStudent();
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();

    }
}

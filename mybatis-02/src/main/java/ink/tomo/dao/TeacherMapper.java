package ink.tomo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import ink.tomo.pojo.Teacher;

import java.util.List;

public interface TeacherMapper {
    @Select("select * from teacher where id = #{tid}")
    Teacher getTeacherById(@Param("tid") int id);
    List<Teacher> getTeacher();
}

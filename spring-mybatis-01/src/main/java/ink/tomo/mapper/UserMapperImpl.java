package ink.tomo.mapper;

import ink.tomo.pojo.User;
import lombok.Setter;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author
 * @create 2021-06-09 16:16
 **/
@Setter
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;
    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}

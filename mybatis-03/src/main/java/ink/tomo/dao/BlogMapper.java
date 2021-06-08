package ink.tomo.dao;

import ink.tomo.pojo.Blog;
import org.apache.ibatis.annotations.Insert;

import java.util.List;
import java.util.Map;

/**
 * @author
 * @create 2021-06-07 21:34
 **/
public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIf(Map map);
    List<Blog> queryBlogChoose(Map map);
    int updateBlog(Map map);
    List<Blog> queryBlogForeach(Map map);
}

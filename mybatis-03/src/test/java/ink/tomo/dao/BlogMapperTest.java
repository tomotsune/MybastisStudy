package ink.tomo.dao;

import ink.tomo.pojo.Blog;
import ink.tomo.utils.IDUtils;
import ink.tomo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author
 * @create 2021-06-07 21:23
 **/
public class BlogMapperTest {
    @Test
    public void getId() {
        String id = IDUtils.getId();
        System.out.println(id);
    }

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);

        Blog no1 = new Blog();
        no1.setId(IDUtils.getId());
        no1.setAuthor("tomo");
        no1.setTitle("Art of testing");
        no1.setCreateTime(new Date());
        no1.setViews(2);
        blogMapper.addBlog(no1);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void queryBlogIf() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","Introduction to alg");
        List<Blog> blogs = blogMapper.queryBlogIf(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper blogMapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        List<Blog> blogs = blogMapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}

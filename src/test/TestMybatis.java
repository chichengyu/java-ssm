import cn.xiaochi.dao.UserDao;
import cn.xiaochi.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


public class TestMybatis {
    @Test
    public void test1() throws Exception {
        // 加载配置mybatis文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 创建 qlSessionFactory 工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 获取 sqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取代理对象
        UserDao user = sqlSession.getMapper(UserDao.class);

        User one = user.findOne(10);
        System.out.println(one);
        in.close();
    }
}

import cn.xiaochi.domain.User;
import cn.xiaochi.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testService(){
        ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserService userService = spring.getBean("UserService", UserService.class);

        User user = userService.findOne();

        System.out.println(user);
    }

}

package cwnu.comp;

import cwnu.comp.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    @Test
    public void testBean() {
        // 创建一个应用上下文，通常从XML文件中加载配置信息
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过上下文获取名为 "User" 的 Bean 对象
//        User user = context.getBean(User.class);
        User user = context.getBean("user", User.class);
        // 打印用户对象的字符串表示形式
        System.out.println(user);
    }
}

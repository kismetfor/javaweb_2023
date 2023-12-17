package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {
    /**
     * 调用execute()方法建表
     */
    public static void main(String[] args){
        ApplicationContext appContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdTemplate= (JdbcTemplate) appContext.getBean("jdbcTemplate");
        jdTemplate.execute("create table account("+
                "id int primary key auto_increment,"+
                "username varchar(50),balance double)");
        System.out.println("账户表account创建成功！");
    }
}

package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class AnnotationTest {
    public static void main(String [] args){
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        /*AccountDaoImpl accountDao=new AccountDaoImpl();
        JdbcTemplate jTemplate= (JdbcTemplate) appContext.getBean("jdbcTemplate");
        accountDao.setJdbcTemplate(jTemplate);*/
        AccountDao accountDao = appContext.getBean(AccountDao.class);
        accountDao.transfer("赵强","张平",200.00);
        System.out.println("转账成功！！");
    }
}

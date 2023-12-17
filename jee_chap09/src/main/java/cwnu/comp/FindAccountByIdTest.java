package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindAccountByIdTest {
    public static void main(String[] args) {
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = appContext.getBean(AccountDao.class);
        Account account=accountDao.findAccountById(2);
        System.out.println(account);
    }
}

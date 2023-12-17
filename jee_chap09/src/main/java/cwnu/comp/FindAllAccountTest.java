package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class FindAllAccountTest {
    public static void main(String[] args) {
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = appContext.getBean(AccountDao.class);
        List<Account> accounts=accountDao.findAllAccount();
        System.out.println(accounts);
    }
}

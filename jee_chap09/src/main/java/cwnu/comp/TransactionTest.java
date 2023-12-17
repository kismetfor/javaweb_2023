package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionTest {
    public static void main(String [] args){
        ApplicationContext appContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao = appContext.getBean(AccountDao.class);
        accountDao.transfer("赵强","张平",200.00);
        System.out.println("转账成功！");
    }
}

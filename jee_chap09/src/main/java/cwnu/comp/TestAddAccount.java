package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddAccount {
    public static void main(String[] args){
        ApplicationContext appContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=appContext.getBean(AccountDao.class);
        Account account=new Account();
        account.setUsername("陈立");
        account.setBalance(1000.00);
        int num=accountDao.addAccount(account);
        if(num>0){
            System.out.println("成功插入了"+num+"条数据！");
        }else {
            System.out.println("插入操作执行失败！");
        }
    }
}

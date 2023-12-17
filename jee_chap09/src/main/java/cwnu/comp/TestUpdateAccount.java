package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUpdateAccount {
    public static void main(String[] args){
        ApplicationContext appContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=appContext.getBean(AccountDao.class);
        Account account=new Account();
        account.setId(1);
        account.setUsername("孙宏");
        account.setBalance(2000.00);
        int num=accountDao.updateAccount(account);
        if(num>0){
            System.out.println("成功修改了"+num+"条数据！");
        }else {
            System.out.println("修改操作执行失败！");
        }
    }
}

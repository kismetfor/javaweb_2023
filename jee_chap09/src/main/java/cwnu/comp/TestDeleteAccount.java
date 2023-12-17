package cwnu.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeleteAccount {
    public static void main(String[] args){
        ApplicationContext appContext=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        AccountDao accountDao=appContext.getBean(AccountDao.class);
        int num=accountDao.deleteAccount(2      );
        if(num>0){
            System.out.println("成功删除了"+num+"条数据！");
        }else {
            System.out.println("删除操作执行失败！");
        }
    }
}

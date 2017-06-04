package AOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zcy on 2017/5/28.
 */
public class test {
    public static void main(String[] args) {
        /*读取Spring配置文件，创建一个Bean工厂*/
        BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao dao= (UserDao) factory.getBean("userDao");
        dao.save("zhou");
    }
}

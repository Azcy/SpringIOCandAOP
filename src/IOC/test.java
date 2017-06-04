package IOC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by zcy on 2017/5/28.
 */
public class test {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean bean=(Bean)factory.getBean("bean");
        Set set =bean.getSet();
        Iterator it=set.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
        Map map=bean.getMap();
        Set set1=map.keySet();
        Iterator it1=set1.iterator();
        while (it1.hasNext()){
            String key=(String)it1.next();
            String value=(String)map.get(key);
            System.out.println("key="+key+"value="+value);
        }

    }
}

package AOP;

/**
 * Created by zcy on 2017/5/28.
 */
public class UserDao {
    public void save(String name){
        System.out.println("---- save user ----");
    }
    public void delete(){
        System.out.println("---- delete user ----");
    }
    public void update(){
        System.out.println("---- update user ----");
    }
}

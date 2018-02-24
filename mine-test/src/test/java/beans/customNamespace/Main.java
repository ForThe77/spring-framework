package beans.customNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Date: Created in 16:26 2018/2/24
 * @Author: Roy
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("beans/customNamespace/test.xml");
        User user = (User) bf.getBean("testbean");
        System.out.println("userName: " + user.getUserName());
        System.out.println("email: " + user.getEmail());
    }
}

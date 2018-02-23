package beans.replacedMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Date: Created in 11:24 2018/2/23
 * @Author: Roy
 * @Modified By:
 */
public class Main {

    /**
     * 动态替换原有方法
     */
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("beans/replacedMethod/replacedMethodTest.xml");
        TestChangeMethod testChangeMethod = (TestChangeMethod) bf.getBean("testChangeMethod");
        testChangeMethod.changeMe();
    }
}

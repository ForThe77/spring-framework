package beans.lookupMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: 测试lookup-method
 * @Date: Created in 15:47 2018/2/11
 * @Author: Roy
 * @Modified By:
 */
public class LookUpMainTest {

    public static void main(String[] args) {
       ApplicationContext bf = new ClassPathXmlApplicationContext("beans/lookupMethod/lookupTest.xml");
       GetBeanTest getBeanTest = (GetBeanTest) bf.getBean("getBeanTest");
       getBeanTest.showMe();
    }

}

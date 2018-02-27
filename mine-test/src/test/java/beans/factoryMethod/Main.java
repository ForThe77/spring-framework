package beans.factoryMethod;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:
 * @Date: Created in 10:12 2018/2/26
 * @Author: Roy
 * @Modified By:
 */
public class Main {

    /**
     * 通过调用静态工厂方法创建 bean
     */
    @Test
    public void testCreateBeanByConstructor() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans/factoryMethod/applicationContext.xml"));
        IUserService userService = (IUserService) bf.getBean("userStaticFactory");
        userService.show();
    }

    /**
     * 通过调用实例工厂方法创建 bean
     */
    @Test
    public void testCreateBeanByInstanceFactory() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans/factoryMethod/applicationContext.xml"));
        IUserService userService = (IUserService) bf.getBean("userFactory");
        userService.show();
    }

}

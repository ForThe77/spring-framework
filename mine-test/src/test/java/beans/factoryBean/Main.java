package beans.factoryBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description:
 * @Date: Created in 11:07 2018/2/26
 * @Author: Roy
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans/factoryBean/applicationContext.xml"));
        // 当调用getBean("car")时，Spring通过反射机制发现CarFactoryBean实现了FactoryBean接口，
        // 这是Spring容器就调用接口方法CarFactoryBean#getObject返回。
        Object object1 = bf.getBean("car");
        System.out.println("object1: " + object1.getClass());
        // 如果希望获取CarFactoryBean的实例，则需要在使用getBean("&car")，在beanName前显示的加上“&”前缀。
        Object object2 = bf.getBean("&car");
        System.out.println("object2: " + object2.getClass());
    }

}

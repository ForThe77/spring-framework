package beans.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @Description: 测试beans
 * @Date: Created in 14:30 2018/2/4
 * @Author: Roy
 * @Modified By:
 */
public class BeanFactoryTest {

    /**
     * 1.首先调用ClassPathResource的构造函数来构造Resource资源文件的实例对象。
     */
    @Test
    public void testSimpleLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beans/bean/beanFactoryTest.xml"));
        //ApplicationContext bf = new ClassPathXmlApplicationContext("beans/bean/beanFactoryTest.xml");
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
        //BeanDefinition bd = bf.getBeanDefinition("myTestBean");
        System.out.println("testStr: " + myTestBean.getTestStr());
        //System.out.println("testMeta: " + bd.getAttribute("testMeta"));
        System.out.println("testConstructorArg1:" + myTestBean.getTestConstructorArg1());
        System.out.println("testConstructorArg2:" + myTestBean.getTestConstructorArg2());
        System.out.println("testConstructorArg3:" + myTestBean.getTestConstructorArg3());
        System.out.println("testConstructorArg4:" + myTestBean.getTestConstructorArg4());
        System.out.println("testConstructorArg5:" + myTestBean.getTestConstructorArg5());
        System.out.println("testProperty: " + myTestBean.getTestProperty());
    }

}

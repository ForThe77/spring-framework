package mine.beans;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("mine/beanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
        System.out.println("testStr: " + myTestBean.getTestStr());
    }

}

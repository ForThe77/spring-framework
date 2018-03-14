package beans.circularRefrence;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Date: Created in 19:10 2018/3/1
 * @Author: Roy
 * @Modified By:
 */
public class Main {

    /**
     * 1.构造器循环依赖
     * 表示构造器注入构成的循环依赖，此依赖是无法解决的，只能抛出BeanCurrentlyInCreationException异常表示循环依赖。
     * Spring容器将每一个正在创建的bean标识符放在一个“当前创建bean池”中，bean标识符在创建过程中将一直保持在这个池中，
     * 因此如果在创建“bean”过程中发现自己已经在“当前创建bean池”里时，将抛出BeanCurrentlyInCreationException异常表示循环依赖。
     * 而对于创建完毕的bean，将从“当前创建bean池”中清除掉。
     */
    @Test(expected = BeanCurrentlyInCreationException.class)
    public void test1() throws Throwable {
        try {
            new ClassPathXmlApplicationContext("beans/circularRefrence/test1.xml");
        } catch (Exception e) {
            // 因为要在创建testC时抛出
            Throwable e1 = e.getCause().getCause();
            throw e1;
        }
    }

    /**
     * 2.setter循环依赖：
     * 表示通过setter注入方式构成的循环依赖。
     * 此依赖是通过Spring容器提前暴露刚完成构造器注入但未完成其他步骤（如setter注入）的bean来完成的，
     * 而且只能解决单例作用域的bean循环依赖。通过提前暴露一个单例工厂方法，从而使其他bean能引用到该bean。
     */
    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans/circularRefrence/test2.xml");
        beans.circularRefrence.test2.TestA testA = context.getBean("testA", beans.circularRefrence.test2.TestA.class);
        System.out.println(testA);
    }


}

package beans.customNamespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @Description: 创建一个handler文件，扩展自NamespaceHandlerSupport，目的是将组件注册到Spring容器
 * @Date: Created in 15:38 2018/2/24
 * @Author: Roy
 * @Modified By:
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

    /**
     * 当遇到自定义标签<user:aaa这样类似于user开头的元素，就会把这个元素扔给对应的UserBeanDefintionParser去解析。
     */
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}

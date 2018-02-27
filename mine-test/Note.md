#####一、Spring bean中的子元素：
1.解析子元素meta（元数据）
当需要使用里面的信息时，可以通过BeanDefinition的getAttribute(key)方法进行获取。
2.解析子元素lookup-method（获取器注入）
获取器注入是一种特殊的方法注入，它是把一个方法声明为返回某种类型的bean，但实际要返回的bean是在配置文件里面配置的，此方法可用在
设计有些可插拔的功能上，解除程序依赖。
3.解析子元素replaced-method（方法替换）
与look-up不同的是，replaced-method不但可以动态地替换返回实体bean，而且还能动态地更改原有方法的逻辑。

#####二、Spring自定义标签配置步骤：
1.创建一个需要扩展的组件。
2.定义一个XSD文件描述组件内容。
3.创建一个文件，实现BeanDefinitionParser接口，用来解析XSD文件中的定义和组件定义。
4.创建一个Handler文件，扩展自NamespaceHandlerSupport，目的是将组件注册到Spring容器。
5.编写Spring.handlers和Spring.schemas文件。

#####三、通过静态工厂和实例工厂创建bean的区别：
1.通过调用静态工厂方法创建 bean：
    将对象创建的过程封装到静态方法中, 当客户端需要对象时, 只需要简单地调用静态方法, 而不需要关心创建对象的细节。
    要声明通过静态方法创建的bean , 需要在bean的class属性里面指定拥有该工厂的方法的类, 同时在factory-method属性里指定工厂方法的名称。最后,使用<constructor-arg>元素为该方法传递方法参数。
2.通过调用实例工厂方法创建 bean：
    将对象的创建过程封装到另外一个对象实例的方法里。当客户端需要请求对象时, 只需要简单的调用该实例方法而不需要关心对象的创建细节。
    要声明通过实例工厂方法创建的bean：
    1)在bean的factory-bean属性里指定拥有该工厂方法的bean。
    2)在factory-method属性里指定该工厂方法的名称。
    3)使用<constructor-arg>元素为工厂方法传递方法参数。































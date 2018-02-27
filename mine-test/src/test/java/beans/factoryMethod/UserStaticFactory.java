package beans.factoryMethod;

/**
 * @Description: 静态工厂类
 * @Date: Created in 10:10 2018/2/26
 * @Author: Roy
 * @Modified By:
 */
public class UserStaticFactory {

    public static IUserService newInstance(String message){
        //返回需要的Bean实例
        return new UserServiceImpl(message);
    }

}

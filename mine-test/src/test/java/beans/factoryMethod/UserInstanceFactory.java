package beans.factoryMethod;

/**
 * @Description: 实例工厂类
 * @Date: Created in 10:19 2018/2/26
 * @Author: Roy
 * @Modified By:
 */
public class UserInstanceFactory {

    public IUserService newInstance(String message){
        return new UserServiceImpl(message);
    }

}

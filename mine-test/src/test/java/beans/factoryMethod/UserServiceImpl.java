package beans.factoryMethod;

/**
 * @Description:
 * @Date: Created in 10:09 2018/2/26
 * @Author: Roy
 * @Modified By:
 */
public class UserServiceImpl implements IUserService {

    private String message;

    public UserServiceImpl() {
        this.message = "lixiaoxi";
    }

    public UserServiceImpl(String message) {
        this.message = message;
    }

    @Override
    public void show() {
        System.out.println("hello, " + message);
    }
}

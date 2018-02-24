package beans.customNamespace;

/**
 * @Description: 普通POJO，只用来接收配置文件
 * @Date: Created in 15:17 2018/2/24
 * @Author: Roy
 * @Modified By:
 */
public class User {

    private String UserName;

    private String email;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

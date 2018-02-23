package beans.bean;

/**
 * @Description:
 * @Date: Created in 15:32 2018/2/23
 * @Author: Roy
 * @Modified By:
 */
public class TestConstructorArg {

    private String arg;

    public TestConstructorArg(String arg) {
        this.arg = arg;
    }

    public String getArg() {
        return arg;
    }

    public void setArg(String arg) {
        this.arg = arg;
    }

    @Override
    public String toString() {
        return "TestConstructorArg{" +
                "arg='" + arg + '\'' +
                '}';
    }
}

package beans.lookupMethod;

/**
 * @Description:
 * @Date: Created in 15:45 2018/2/11
 * @Author: Roy
 * @Modified By:
 */
public abstract class GetBeanTest {

    public abstract User getBean();

    public void showMe() {
        this.getBean().showMe();
    }

}

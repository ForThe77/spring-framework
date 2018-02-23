package beans.lookupMethod;

/**
 * @Description:
 * @Date: Created in 9:55 2018/2/23
 * @Author: Roy
 * @Modified By:
 */
public class Student extends User {

    @Override
    public void showMe() {
        System.out.println("I am a Student.");
    }
}

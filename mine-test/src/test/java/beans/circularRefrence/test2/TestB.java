package beans.circularRefrence.test2;

/**
 * @Description:
 * @Date: Created in 19:01 2018/3/1
 * @Author: Roy
 * @Modified By:
 */
public class TestB {

    private TestC testC;

    public void b() {
        testC.c();
    }

    public TestC getTestC() {
        return testC;
    }

    public void setTestC(TestC testC) {
        this.testC = testC;
    }
}

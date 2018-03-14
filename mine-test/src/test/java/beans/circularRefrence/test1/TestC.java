package beans.circularRefrence.test1;

/**
 * @Description:
 * @Date: Created in 19:01 2018/3/1
 * @Author: Roy
 * @Modified By:
 */
public class TestC {

    private TestA testA;

    public TestC(TestA testA) {
        this.testA = testA;
    }

    public void c() {
        testA.a();
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}

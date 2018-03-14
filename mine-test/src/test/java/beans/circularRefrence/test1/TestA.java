package beans.circularRefrence.test1;

/**
 * @Description:
 * @Date: Created in 19:01 2018/3/1
 * @Author: Roy
 * @Modified By:
 */
public class TestA {

    private TestB testB;

    public TestA(TestB testB) {
        this.testB = testB;
    }

    public void a() {
        testB.b();
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}

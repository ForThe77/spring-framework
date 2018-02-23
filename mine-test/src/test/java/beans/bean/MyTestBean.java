package beans.bean;

import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Date: Created in 14:27 2018/2/4
 * @Author: xrwang3
 * @Modified By:
 */
public class MyTestBean {

    private String testStr = "测试字符哦";

    private String testProperty;

    private String testConstructorArg1;

    private int testConstructorArg2;

    private List<String> testConstructorArg3;

    private Map<String, Integer> testConstructorArg4;

    private TestConstructorArg testConstructorArg5;

    public MyTestBean(String testConstructorArg1, int testConstructorArg2, List<String> testConstructorArg3, Map<String, Integer> testConstructorArg4, TestConstructorArg testConstructorArg5) {
        this.testConstructorArg1 = testConstructorArg1;
        this.testConstructorArg2 = testConstructorArg2;
        this.testConstructorArg3 = testConstructorArg3;
        this.testConstructorArg4 = testConstructorArg4;
        this.testConstructorArg5 = testConstructorArg5;
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public String getTestProperty() {
        return testProperty;
    }

    public void setTestProperty(String testProperty) {
        this.testProperty = testProperty;
    }

    public String getTestConstructorArg1() {
        return testConstructorArg1;
    }

    public void setTestConstructorArg1(String testConstructorArg1) {
        this.testConstructorArg1 = testConstructorArg1;
    }

    public int getTestConstructorArg2() {
        return testConstructorArg2;
    }

    public void setTestConstructorArg2(int testConstructorArg2) {
        this.testConstructorArg2 = testConstructorArg2;
    }

    public List<String> getTestConstructorArg3() {
        return testConstructorArg3;
    }

    public void setTestConstructorArg3(List<String> testConstructorArg3) {
        this.testConstructorArg3 = testConstructorArg3;
    }

    public Map<String, Integer> getTestConstructorArg4() {
        return testConstructorArg4;
    }

    public void setTestConstructorArg4(Map<String, Integer> testConstructorArg4) {
        this.testConstructorArg4 = testConstructorArg4;
    }

    public TestConstructorArg getTestConstructorArg5() {
        return testConstructorArg5;
    }

    public void setTestConstructorArg5(TestConstructorArg testConstructorArg5) {
        this.testConstructorArg5 = testConstructorArg5;
    }
}

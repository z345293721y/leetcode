package leetcode;

import org.junit.Test;

/**
 * @author zhangyu
 * @version V1.0
 * @ClassName: GenericityTest
 * @Description: TOTO
 * @date 2018/12/17 20:38
 **/


public class GenericityTest<T> {
    private T t;

    public GenericityTest(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        GenericityTest<String> genericityTest = new GenericityTest<>("zhangsan");
        System.out.println(genericityTest.t);
    }

}

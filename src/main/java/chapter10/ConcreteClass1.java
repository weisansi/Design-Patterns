package chapter10;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/14 7:13 上午
 */

public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("concrete class1 do something.");
    }

    @Override
    protected void doAnything() {
        System.out.println("concrete class1 do anything.");
    }
}

package jdkProxy.demo02;

/**
 * 业务组件接口的实现类
 */

public class BusinessClass implements BusinessFacade {
    public void doSomething() {
        System.out.println("在业务组件 BusinessClass 中调用方法: doSomething()");
    }
}

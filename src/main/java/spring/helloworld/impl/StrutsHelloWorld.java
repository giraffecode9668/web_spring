package spring.helloworld.impl;

import spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {
    @Override
    public void sayHello() {
        System.out.println("struts say spring.helloworld!");
    }
}

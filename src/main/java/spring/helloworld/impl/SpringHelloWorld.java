package spring.helloworld.impl;

import spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("spring say spring.helloworld!");
    }
}

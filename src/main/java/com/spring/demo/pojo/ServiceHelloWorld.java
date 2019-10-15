package com.spring.demo.pojo;

import com.spring.demo.inter.HelloWorld;

public class ServiceHelloWorld {

    private HelloWorld helloWorld;

    public ServiceHelloWorld() {

    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

}

package com.spring.demo.test;

import com.spring.demo.inter.HelloWorld;
import com.spring.demo.pojo.ServiceHelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProgramHelloWorld {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ServiceHelloWorld service = (ServiceHelloWorld) context.getBean("serviceHelloWorld");

        HelloWorld hw = service.getHelloWorld();

        hw.sayHelloWorld();
    }

}

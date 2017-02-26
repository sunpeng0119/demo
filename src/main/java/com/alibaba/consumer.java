package com.alibaba;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunpeng on 2017/2/7.
 */
public class consumer {
    public static void test(String[] args){
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext(new String[] {"file:src/main/resources/spring/consumer.xml"});
        context.start();
        DemoService service = (DemoService)context.getBean("demoService");
        System.out.println(service.sayHello("sunpeng"));
    }
}

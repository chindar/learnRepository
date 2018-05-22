package com.itdoc.learn.source.replaced.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chinda
 * @desc TODO
 * @date 2018/5/18 18:01
 * @since 1.0
 */
public class ReplaceClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/replacerTest.xml");
        TestChangeMethod bean = (TestChangeMethod) applicationContext.getBean("testChangeMethod");
        bean.changeMe();
    }
}

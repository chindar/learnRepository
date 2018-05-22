package com.itdoc.learn.source.lookup.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Wang Chinda
 * @desc TODO
 * @date 2018/5/18 17:28
 * @since 1.0
 */
public class ClientMainTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/lookupTest.xml");
        BaseGetBeanTest bean = (BaseGetBeanTest) applicationContext.getBean("getBeanTest");
        bean.showMe();
    }
}

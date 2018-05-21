/**
 * @filename: CustomMain.java
 * @author: Wang Chinda
 * @date: 2018-05-21
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180521   Wang Chinda   create
 * 20180521   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @desc 测试
 * @author Wang Chinda
 * @create 2018-05-21 14:58
 */
public class CustomMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("test/customTest.xml");
        User user = (User) applicationContext.getBean("customBeanTest");
        System.out.println(user.getEmail() + " ---- " + user.getUserName());
    }
}

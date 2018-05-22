package com.itdoc.learn.source.test;

import org.apache.commons.lang3.StringUtils;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.assertEquals;


/**
 * @author Wang Chinda
 * @desc TODO
 * @date 2018/5/14 16:43
 * @since 1.0
 */
public class BeanFactoryTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("test/beanFactoryTest.xml"));
        MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
        assertEquals("testStr", myTestBean.getStr());
        System.out.println(StringUtils.equals("testStr", myTestBean.getStr()));
    }
}

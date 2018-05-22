package com.itdoc.learn.source.replaced.method;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author Wang Chinda
 * @desc TODO
 * @date 2018/5/18 17:55
 * @since 1.0
 */
public class TestMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("我替换了原有方法");
        return null;
    }
}

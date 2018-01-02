/**
 * @filename MyService.Java
 * @desc 测试Service
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 9:23
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 9:23
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.service;

import org.springframework.stereotype.Service;

/**
 * @desc 测试Service
 * @author Chinda Wang
 * @create 2018-01-02 9:23
 */
@Service
public class MyService {

    public String getHelloWorld() {
        return "hello, world!!";
    }

    public void preHandle() {
        System.out.println("第一个拦截器调用 MyService 中 preHandle方法!!!");
    }

    public void postHandle() {
        System.out.println("第一个拦截器调用 MyService 中 postHandle方法!!!");
    }

    public void afterCompletion() {
        System.out.println("第一个拦截器调用 MyService 中 afterCompletion方法!!!");
    }

    public void getFilterInit() {
        System.out.println("Filter 初始化中调用 MyService 中 getFilterInit 方法!!!");
    }

    public void getFilterDoFilter(String code) {
        System.out.println("Filter doFilter 方法中调用 MyService 中 getFilterDoFilter 方法!!!在调用chain.doFilter方法" + code);
    }

    public void getFilterDestroy() {
        System.out.println("销毁 Filter 中调用 MyService 中 getFilterDestroy方法!!!");
    }
}

/**
 * @filename MyIntercepterScond.Java
 * @desc 我的第二个拦截器
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 10:16
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 10:16
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.intercepter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @desc 我的第二个拦截器
 * @author Chinda Wang
 * @create 2018-01-02 10:16
 */
@Component
public class MyIntercepterScond implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        System.out.println("第二个拦截器调用 preHandle方法!!!");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) throws Exception {
        System.out.println("第二个拦截器调用 postHandle方法!!!");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception {
        System.out.println("第二个拦截器调用 afterCompletion方法!!!");
    }
}

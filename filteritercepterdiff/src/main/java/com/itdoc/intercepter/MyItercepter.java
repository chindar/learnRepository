/**
 * @filename MyItercepter.Java
 * @desc 拦截器测试
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 7:46
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 7:46
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.intercepter;

import com.itdoc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @desc 拦截器测试
 * @author Chinda Wang
 * @create 2018-01-02 7:46
 */
@Component
public class MyItercepter implements HandlerInterceptor {

    @Autowired
    private MyService myService;

    /**
     * 在调用 Controller 之前调用
     * @param request
     * @param response
     * @param obj
     * @return true 表示继续流程(调用下一个拦截器或处理器) false 表示中断流程, 不在调用其它拦截器或处理器, 需要通过 response 来响应。
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
        System.out.println("第一个拦截器调用 preHandle方法!!!");
        myService.preHandle();
        return true;
    }

    /**
     * 在Controller调用之后, DispatcherServlet返回渲染视图之前被调用, 可操作ModelAndView对象对试图进行渲染操作。
     * 注意: ModelAndView对象有可能为null
     * @param request
     * @param response
     * @param obj
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object obj, ModelAndView modelAndView) throws Exception {
        System.out.println("第一个拦截器调用 postHandle方法!!!");
        myService.postHandle();
    }

    /**
     * 在视图渲染完毕后调用
     * @param request
     * @param response
     * @param obj
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object obj, Exception e) throws Exception {
        System.out.println("第一个拦截器调用 afterCompletion方法!!!");
        myService.afterCompletion();
    }
}

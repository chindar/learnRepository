/**
 * @filename MyFilter.Java
 * @desc 过滤器测试
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 7:45
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 7:45
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.filter;

import com.itdoc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;


/**
 * @desc 过滤器测试
 * @author Chinda Wang
 * @create 2018-01-02 7:45
 */
@Component
public class MyFilter implements Filter {

    @Autowired
    private MyService myService;

    /**
     * Filter 初始化
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化Filter!!!");
        myService.getFilterInit();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter doFilter方法!!!");
        System.out.println("Filter调用chain.doFilter方法之前!!!");
        myService.getFilterDoFilter("之前");
        chain.doFilter(request, response);
        myService.getFilterDoFilter("之后");
        System.out.println("Filter调用chain.doFilter方法之后!!!");
    }

    @Override
    public void destroy() {
        System.out.println("销毁Filter!!");
        myService.getFilterDestroy();
    }
}

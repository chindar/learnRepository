/**
 * @filename MyIntercepterConfig.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 8:33
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 8:33
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.configuration;

import com.itdoc.intercepter.MyIntercepterScond;
import com.itdoc.intercepter.MyItercepter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 8:33
 */
@Component
public class MyIntercepterConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private MyItercepter myItercepter;

    @Autowired
    private MyIntercepterScond myIntercepterScond;

    /**
     * 在容器中注册拦截器, 定义拦截器拦截所针对的 uri
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myItercepter).addPathPatterns("/**");
        registry.addInterceptor(myIntercepterScond).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}

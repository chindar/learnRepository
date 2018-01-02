/**
 * @filename RestTemplateBean.Java
 * @desc 向IOC容器注入restTemplate的bean节点
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 14:52
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 14:52
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.bean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @desc 向IOC容器注入restTemplate的bean节点
 * @author Chinda Wang
 * @create 2018-01-02 14:52
 */
@Component
public class RestTemplateBean {

    @Bean
    //表明开启负载均衡功能
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

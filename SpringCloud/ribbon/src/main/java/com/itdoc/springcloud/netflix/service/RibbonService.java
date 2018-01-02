/**
 * @filename RibbonService.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 15:03
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 15:03
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 15:03
 */
@Service
public class RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String EUREKA_CLIENT_URL = "http://EUREKA-CLIENT/hi?name=";

    // 对该方法创建熔断功能, 指定fallbackMethod熔断方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject(EUREKA_CLIENT_URL + name, String.class);
    }

    public String hiError(String name) {
        return "hi, " + name + "! sorry, i am error!";
    }
}

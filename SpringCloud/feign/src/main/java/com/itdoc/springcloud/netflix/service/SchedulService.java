package com.itdoc.springcloud.netflix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ${AUTHOR}
 * @version v1.0
 * @filename SchedulService.Java
 * @desc ${DESCRIPTION}
 * @blog http://www.cnblogs.com/goodcheap
 * @create 2018-01-02 15:22
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 15:22
 * @modifyauthor ${AUTHOR}
 * @modifydesc
 */
// 指定调用的服务
@FeignClient(value = "eureka-client", fallback = SchedulServiceHystrix.class)
public interface SchedulService {

    // 指定调用服务中的接口
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

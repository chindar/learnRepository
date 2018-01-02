/**
 * @filename EurekaClientController.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 14:27
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 14:27
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 14:27
 */
@RestController
public class EurekaClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String helloWorld(@RequestParam String name) {
        return "hello, " + name + "!! i am from port: " + port;
    }
}

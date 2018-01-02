/**
 * @filename ConfigClientController.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 16:57
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 16:57
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 16:57
 */
@RestController
public class ConfigClientController {

    @Value("${spring.profiles.active}")
    private String profile;

    @RequestMapping("/hi")
    public String hi() {
        return profile;
    }

}

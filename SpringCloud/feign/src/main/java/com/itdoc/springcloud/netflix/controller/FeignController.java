/**
 * @filename FeignController.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 15:27
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 15:27
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.controller;

import com.itdoc.springcloud.netflix.service.SchedulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 15:27
 */
@RestController
public class FeignController {

    @Autowired
    private SchedulService schedulService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedulService.sayHiFromClientOne(name);
    }
}

/**
 * @filename MyController.Java
 * @desc Controller 测试
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 7:57
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 7:57
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.controller;

import com.itdoc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc Controller 测试
 * @author Chinda Wang
 * @create 2018-01-02 7:57
 */
@RestController
public class MyController {

    @Autowired
    private MyService myService;

    @RequestMapping("/hi")
    public String helloWorld() {
        return myService.getHelloWorld();
    }
}

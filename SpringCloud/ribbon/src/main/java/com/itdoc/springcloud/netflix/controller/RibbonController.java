/**
 * @filename RibbonController.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 15:10
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 15:10
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.controller;

import com.itdoc.springcloud.netflix.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 15:10
 */
@RestController
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
}

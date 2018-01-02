/**
 * @filename SchedulServiceHystrix.Java
 * @desc
 * @blog http://www.cnblogs.com/goodcheap
 * @author Chinda Wang
 * @create 2018-01-02 15:43
 * @version v1.0
 * @copyright Copyright © 2017 达华信息科技有限公司 版权所有
 * @modifyhistory 2018-01-02 15:43
 * @modifyauthor Chinda Wang
 * @modifydesc
 */
package com.itdoc.springcloud.netflix.service;

import org.springframework.stereotype.Component;

/**
 * @desc
 * @author Chinda Wang
 * @create 2018-01-02 15:43
 */
@Component
public class SchedulServiceHystrix implements SchedulService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry! hello, " + name + "!";
    }
}

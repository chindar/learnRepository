/**
 * @filename: MyNameSpaceHandler.java
 * @author: Wang Chinda
 * @date: 2018-05-21
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180521   Wang Chinda   create
 * 20180521   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @desc 自定义命名空间控制器
 * @author Wang Chinda
 * @create 2018-05-21 14:28
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParse());
    }
}

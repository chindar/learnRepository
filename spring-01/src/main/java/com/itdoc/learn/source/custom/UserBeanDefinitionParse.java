/**
 * @filename: UserBeanDefinitionParse.java
 * @author: Wang Chinda
 * @date: 2018-05-21
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180521   Wang Chinda   create
 * 20180521   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @desc 自定义bean定义解析
 * @author Wang Chinda
 * @create 2018-05-21 14:20
 */
public class UserBeanDefinitionParse extends AbstractSingleBeanDefinitionParser {

    /**
     * Element对应的类
     * @param element
     * @return
     */
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");

        // 将提取到的数据放入到BeanDefinitionBuilder中, 待完成所有bean的解析后统一注册到beanFactory中
        if (StringUtils.hasText(userName)) {
            builder.addPropertyValue("userName", userName);
        }

        if (StringUtils.hasText(email)) {
            builder.addPropertyValue("email", email);
        }
    }
}

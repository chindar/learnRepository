/**
 * @filename: User.java
 * @author: Wang Chinda
 * @date: 2018-05-21
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180521   Wang Chinda   create
 * 20180521   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.custom;

/**
 * @desc 自定义标签测试类
 * @author Wang Chinda
 * @create 2018-05-21 14:03
 */
public class User {
    private String id;
    private String userName;
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

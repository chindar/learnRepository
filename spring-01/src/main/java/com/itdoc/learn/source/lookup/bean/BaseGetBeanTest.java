package com.itdoc.learn.source.lookup.bean;

/**
 * @author Wang Chinda
 * @desc TODO
 * @date 2018/5/18 17:25
 * @since 1.0
 */
public abstract class BaseGetBeanTest {

    public void showMe() {
        this.getBean().showMe();
    }

    /**
     * 获取bean
     * @return
     */
    protected abstract User getBean();
}

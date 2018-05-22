/**
 * @filename: AnstractBeanDefinitionInfo.java
 * @author: Wang Chinda
 * @date: 2018-05-21
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180521   Wang Chinda   create
 * 20180521   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.*;
import org.springframework.core.io.Resource;
import java.util.*;

/**
 * @author Wang Chinda
 * @desc AbstractBeanDefinition 详细信息
 * @create 2018-05-21 10:23
 */
public class AnstractBeanDefinitionInfo {


    /**
     * Constant for the default scope name: "", equivalent to singleton status
     * but to be overridden from a parent bean definition (if applicable).
     */
    public static final String SCOPE_DEFAULT = "";

    /**
     * Constant that indicates no autowiring at all.
     *
     * @see #setAutowireMode
     */
    public static final int AUTOWIRE_NO = AutowireCapableBeanFactory.AUTOWIRE_NO;

    /**
     * Constant that indicates autowiring bean properties by name.
     *
     * @see #setAutowireMode
     */
    public static final int AUTOWIRE_BY_NAME = AutowireCapableBeanFactory.AUTOWIRE_BY_NAME;

    /**
     * Constant that indicates autowiring bean properties by type.
     *
     * @see #setAutowireMode
     */
    public static final int AUTOWIRE_BY_TYPE = AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE;

    /**
     * Constant that indicates autowiring a constructor.
     *
     * @see #setAutowireMode
     */
    public static final int AUTOWIRE_CONSTRUCTOR = AutowireCapableBeanFactory.AUTOWIRE_CONSTRUCTOR;

    /**
     * Constant that indicates determining an appropriate autowire strategy
     * through introspection of the bean class.
     *
     * @see #setAutowireMode
     * @deprecated as of Spring 3.0: If you are using mixed autowiring strategies,
     * use annotation-based autowiring for clearer demarcation of autowiring needs.
     */
    @Deprecated
    public static final int AUTOWIRE_AUTODETECT = AutowireCapableBeanFactory.AUTOWIRE_AUTODETECT;

    /**
     * Constant that indicates no dependency check at all.
     *
     * @see #setDependencyCheck
     */
    public static final int DEPENDENCY_CHECK_NONE = 0;

    /**
     * Constant that indicates dependency checking for object references.
     *
     * @see #setDependencyCheck
     */
    public static final int DEPENDENCY_CHECK_OBJECTS = 1;

    /**
     * Constant that indicates dependency checking for "simple" properties.
     *
     * @see #setDependencyCheck
     * @see org.springframework.beans.BeanUtils#isSimpleProperty
     */
    public static final int DEPENDENCY_CHECK_SIMPLE = 2;

    /**
     * Constant that indicates dependency checking for all properties
     * (object references as well as "simple" properties).
     *
     * @see #setDependencyCheck
     */
    public static final int DEPENDENCY_CHECK_ALL = 3;

    /**
     * Constant that indicates the container should attempt to infer the {@link
     * #setDestroyMethodName destroy method name} for a bean as opposed to explicit
     * specification of a method name. The value {@value} is specifically designed to
     * include characters otherwise illegal in a method name, ensuring no possibility of
     * collisions with legitimately named methods having the same name.
     */
    public static final String INFER_METHOD = "(inferred)";


    private volatile Object beanClass;

    /** bean的作用范围, 对应bean属性的scope */
    private String scope = SCOPE_DEFAULT;
    /** 是否是单例, 对应bean属性的scope */
    private boolean singleton = true;
    /** 是否是原型, 对应bean属性的scope */
    private boolean prototype = false;
    /** 是否是抽象, 对应bean属性的abstract */
    private boolean abstractFlag = false;
    /** 是否延迟加载, 对应bean属性的lazy-init */
    private boolean lazyInit = false;
    /** 自动注入模式, 对应bean属性的autowire */
    private int autowireMode = AUTOWIRE_NO;
    /** 依赖检查, Spring3.0后弃用这个属性 */
    private int dependencyCheck = DEPENDENCY_CHECK_NONE;
    /** 用来表示一个bean的实例化依靠另一个bean先实例化, 对应bean属性的depent-on */
    private String[] dependsOn;
    /**
     * autowire-candidate属性设置为false, 这样容器在查找自动装配对象时将不考虑该bean节点, 即它不会被考虑作为其他bean自动装配的候选者,
     * 但该bean本身还是可以使用自动装配来注入其他bean的. 对应bean属性的autowire-candidate
     */
    private boolean autowireCandidate = true;
    /** 自动装配时, 当出现多个bean候选者时, 将作为首选者, 对应bean属性的primary */
    private boolean primary = false;
    /** 用于记录Qualifier, 对应子元素qualifier */
    private final Map<String, AutowireCandidateQualifier> qualifiers =
            new LinkedHashMap<String, AutowireCandidateQualifier>(0);
    /** 允许访问非公开的构造器和方法, 程序设置 */
    private boolean nonPublicAccessAllowed = true;
    /**
     * 是否以一种宽松的模式解析构造函数, 默认为true,
     * 如果为false, 则在如下情况时:
     * interface ITest {}
     * class ITestImpl implements ITest {}
     * class Main {
     *     Main(ITest i){};
     *     Main(ITestImpl i){};
     * }
     * 抛出异常, 因为Spring无法准确的定位到哪个构造器程序设置
     */
    private boolean lenientConstructorResolution = true;
    /** 记录构造函数注入属性, 对应bean属性constructor-arg */
    private ConstructorArgumentValues constructorArgumentValues;
    /** 普通属性集合 */
    private MutablePropertyValues propertyValues;
    /** 方法重写的持有者, 记录lookup-method, repalced-method元素 */
    private MethodOverrides methodOverrides = new MethodOverrides();
    /**
     * 对应bean属性factory-bean, 用法:
     * <bean id="instanceFactoryBean" class="com.itdoc.learn.source.InstanceFactoryBean"/>
     * <bean id="currentTime" factory-bean="instanceFactoryBean" factory-method="createTime"/>
     * package com.itdoc.learn.source;
     * class InstanceFactoryBean {
     *     void createTime() {}
     * }
     */
    private String factoryBeanName;
    /** 对应bean属性的factory-method */
    private String factoryMethodName;
    /** 初始化方法, 对应bean属性的init-method */
    private String initMethodName;
    /** 销毁方法, 对应bean属性的destroy-method */
    private String destroyMethodName;
    /** 是否执行init-method, 程序设置 */
    private boolean enforceInitMethod = true;
    /** 是否执行destroy-method, 程序设置 */
    private boolean enforceDestroyMethod = true;
    /** 是否是用户定义的而不是应用程序本身定义的, 创建AOP时为true, 程序设置 */
    private boolean synthetic = false;
    /** 定义这个bean的应用, APPLICATION: 用户. INFRASTRUCTURE: 完全内部使用, 与用户无关. SUPPORT: 某些复杂配置的一部分.  程序设置 */
    private int role = BeanDefinition.ROLE_APPLICATION;
    /** bean的描述信息 */
    private String description;
    /** bean定义的资源 */
    private Resource resource;

}



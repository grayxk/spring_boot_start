package com.employ.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author grayAdmin
 * @email qxk5670@163.com
 * @create 2019-01-18 15:34
 * To change this template use File | Settings | File Templates.
 * Description: 实验配置文件映射
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "GirlProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

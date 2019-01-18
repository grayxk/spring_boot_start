package com.employ.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author grayAdmin
 * @email qxk5670@163.com
 * @create 2019-01-18 15:43
 * To change this template use File | Settings | File Templates.
 * Description: 验证获取自定义配置文件
 */
@Component
@PropertySource(value = "classpath:/boy.properties",encoding = "UTF-8")
@ConfigurationProperties(prefix = "boy")
public class BoyProperties {
    private String name;

    private Integer age;

    private Integer weight;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoyProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

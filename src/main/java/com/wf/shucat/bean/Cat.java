/**
 * Copyright (C), 2015-2020, 王飞
 * FileName: Cat
 * Author:   WF
 * Date:     2020/4/23 14:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wf.shucat.bean;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈猫咪对象〉
 *
 * @author WF
 * @create 2020/4/23
 * @since 1.0.0
 */
public class Cat {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String temper;
    private String home;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTemper() {
        return temper;
    }

    public void setTemper(String temper) {
        this.temper = temper;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}

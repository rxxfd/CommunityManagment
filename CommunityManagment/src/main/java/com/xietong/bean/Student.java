/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Student
 * Author:   hxq
 * Date:     2019/5/29 16:15
 * Description: 学生实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.bean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈学生实体类〉
 *
 * @author hxq
 * @create 2019/5/29
 * @since 1.0.0
 */
/**
 * 学生类有如下属性:
 * address代表学生住址，类型String；
 * credits代表学生积分，类型int；
 * id代表学生的标识，类型int；
 * name代表学生姓名，类型String；
 * password代表学生账户密码，类型String；
 * phone代表学生电话，类型int。
 * 学生类有如下方法：
 * getAddress（）返回学生住址；
 * setAddress(String)设置学生住址......
 * @author ZhangMingShuo
 *
 */
public class Student {
    private int id;
    private String name;
    private String password;
    private int credits;
    private String phone;
    private String address;
    public Student() {
        this.credits = 100;
    }
    /**
     * 获取学生id
     * @return 学生id
     */
    public int getId() {
        return id;
    }
    /**
     * 设置学生id
     * @param id 学生id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 获取学生姓名
     * @return 学生姓名
     */
    public String getName() {
        return name;
    }
    /**
     * 设置学生姓名
     * @param name 学生姓名
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取学生密码
     * @return 学生登陆密码
     */
    public String getPassword() {
        return password;
    }
    /**
     * 登陆密码
     * @param password 学生登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 返回学生活动积分
     * @return 学生积分
     */
    public int getCredits() {
        return credits;
    }
    /**
     * 设置学生积分
     * @param credits 学生积分
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    /**
     * 获取学生电话
     * @return 学生电话
     */
    public String getPhone() {
        return phone;
    }
    /**
     * 设置学生电话
     * @param phone 学生电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * 获取学生地址
     * @return 学生地址
     */
    public String getAddress() {
        return address;
    }
    /**
     * 设置学生地址
     * @param address 学生地址
     */
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", password=" + password + ", credits=" + credits + ", phone="
                + phone + ", address=" + address + "]";
    }
}



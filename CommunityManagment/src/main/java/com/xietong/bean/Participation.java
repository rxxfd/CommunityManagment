/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Participation
 * Author:   hxq
 * Date:     2019/5/29 16:13
 * Description: 学员参与活动信息实体
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.bean;

/**
 * 参与情况类
 * 有如下属性
 * aid代表活动id
 * aname代表活动名称
 * isSign代表是否签到
 * sid代表学生id
 * sname代表学生姓名
 * @author ZhangMingShuo
 *
 */
public class Participation {
    /**
     * 活动id
     */
    private int aid;
    /**
     * 活动名称
     */
    private String aname;
    /**
     * 学生签到数还是学生是否签到活动
     */
    private int isSign;
    /**
     * 学生id
     */
    private int sid;
    /**
     * 学生姓名
     */
    private String sname;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public int getIsSign() {
        return isSign;
    }
    public void setIsSign(int isSign) {
        this.isSign = isSign;
    }
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }


}



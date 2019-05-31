/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Activity
 * Author:   hxq
 * Date:     2019/5/30 18:22
 * Description: 活动实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.bean;

/**
 * 〈一句话功能简述〉<br> 
 * 〈活动实体类〉
 *
 * @author hxq
 * @create 2019/5/30
 * @since 1.0.0
 */
/**
 * 导师类有如下属性：
 * address 活动地址：String
 * checkinNo 签到人数：int
 * credits 活动积分参与活动的人获得的积分：int
 * description 活动描述：String
 * durationTime 活动进行时间：float
 * isApply 是否允许报名：Boolean
 * pubTime 	发布时间：Date
 * grabTime 抢单时间：Date
 * holdTime 举办时间：Date
 * id 活动类型：int
 * limits 活动人数限制：int
 * lname 导师姓名：String
 * name 活动姓名：String
 * oid 活动组织者：id
 * oname 活动组织者的名字：String
 * @author hxq
 * @version 1.0
 * @created 17-5锟斤拷-2019 14:32:10
 */
import java.util.Date;
public class Activity {
    private String address;
    private int checkinNo;
    private int credits;
    private String description;
    private float durationTime;
    private Date grabTime;
    private Date holdTime;
    private int id;
    private boolean isApply;
    private int lid;
    private int limits;
    private String lname;
    private String name;
    private int oid;
    private String oname;
    private Date pubTime;
    /**
     * state:0 未审核
     * state:1 已审核
     * state:2 抢单中
     * state:3 已抢单
     * state:4 报名中
     * state:5 举办中
     * state:6 已结束
     */
    private int state;
    /**
     * 获得活动状态
     * @return state 活动状态
     */
    public int getState() {
        return state;
    }
    /**
     * 设置活动状态0，1，2，3，4，5，6
     * @param state 活动状态
     */
    public void setState(int state) {
        this.state = state;
    }
    /**
     * 获取活动地址
     * @return address 活动地址
     */
    public String getAddress() {
        return address;
    }
    /**
     * 设置活动地址
     * @param address 活动地址
     */

    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 获取签到人数
     * @return checkinNo 签到人数
     */

    public int getCheckinNo() {
        return checkinNo;
    }
    /**
     * 设置签到人数
     * @param checkinNo 签到人数
     */
    public void setCheckinNo(int checkinNo) {
        this.checkinNo = checkinNo;
    }
    /**
     * 获取活动积分
     * @return credits 活动积分
     */
    public int getCredits() {
        return credits;
    }
    /**
     * 设置活动积分
     * @param credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    /**
     * 获取活动描述
     * @return description 描述
     */
    public String getDescription() {
        return description;
    }
    /**
     * 设置活动描述
     * @param description 活动描述
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * 获取活动进行时间
     * @return durationTime 进行
     */
    public float getDurationTime() {
        return durationTime;
    }
    /**
     * 设置活动时间
     * @param durationTime
     */
    public void setDurationTime(float durationTime) {
        this.durationTime = durationTime;
    }
    /**
     * 获得导师抢单时间
     * @return grabTime 导师抢单时间
     */
    public Date getGrabTime() {
        return grabTime;
    }
    /**
     * 设置抢单时间
     * @param grabTime 抢单时间
     */
    public void setGrabTime(Date grabTime) {
        this.grabTime = grabTime;
    }
    /**
     * 活动举办时间
     * @return holdTime
     */
    public Date getHoldTime() {
        return holdTime;
    }
    /**
     * 设置举办时间
     * @param holdTime 举办时间
     */
    public void setHoldTime(Date holdTime) {
        this.holdTime = holdTime;
    }
    /**
     * 返回活动id
     * @return id 活动id
     */
    public int getId() {
        return id;
    }
    /**
     * 设置活动id
     * @param id 活动id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * 是否可以报名
     * @return isApply
     */
    public boolean isApply() {
        return isApply;
    }
    /**
     * 设置活动可否报名
     * @param apply 可否报名标志
     */
    public void setApply(boolean apply) {
        isApply = apply;
    }
    /**
     * 获得导师id
     * @return lid 导师id
     */
    public int getLid() {
        return lid;
    }
    /**
     * 设置导师id
     * @param lid 导师id
     */
    public void setLid(int lid) {
        this.lid = lid;
    }
    /**
     * 获得活动人数限制
     * @return limits 人数限制
     */
    public int getLimits() {
        return limits;
    }
    /**
     * 设置活动人数上限
     * @param limits
     */
    public void setLimits(int limits) {
        this.limits = limits;
    }
    /**
     * 获得导师姓名
     * @return lname 导师姓名
     */
    public String getLname() {
        return lname;
    }
    /**
     * 设置导师姓名
     * @param lname 导师姓名
     */
    public void setLname(String lname) {
        this.lname = lname;
    }
    /**
     * 获得活动名称
     * @return name 活动名称
     */
    public String getName() {
        return name;
    }
    /**
     * 设置活动名称
     * @param name 活动名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获得活动组织者id
     * @return oid 组织者id
     */
    public int getOid() {
        return oid;
    }
    /**
     * 设置活动组织者id
     * @param oid 活动组织者id
     */
    public void setOid(int oid) {
        this.oid = oid;
    }
    /**
     * 获得活动组织者姓名
     * @return oname 活动组织者姓名
     */
    public String getOname() {
        return oname;
    }
    /**
     * 设置活动组织者姓名
     * @param oname 活动组织者姓名
     */
    public void setOname(String oname) {
        this.oname = oname;
    }
    /**
     * 获得活动发布时间
     * @return pubTime 活动发布时间
     */
    public Date getPubTime() {
        return pubTime;
    }
    /**
     * 设置活动发布时间
     * @param pubTime 活动发布时间
     */
    public void setPubTime(Date pubTime) {
        this.pubTime = pubTime;
    }
}


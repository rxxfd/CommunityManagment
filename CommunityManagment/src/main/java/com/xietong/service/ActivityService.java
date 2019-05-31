package com.xietong.service;

import com.xietong.bean.Activity;

import java.util.List;

/**活动服务层接口
 * Created by hxq on 2019/5/30.
 */
public interface ActivityService {

    /**
     * 通过活动id查找一个活动
     * @param id 活动id
     * @return 一个活动
     */
    public Activity findActivityById(int id);

    /**
     * 通过导师的id查找导师参与过的活动
     * @param lid 导师id
     * @return 活动集合
     */
    public List<Activity> findActivityByLecturerId(int lid);

    /**
     * 通过组织者的id查找组织者组织过的活动
     * @param oid 组织者id
     * @return活动集合
     */
    public List<Activity> findActivityByOrganizerId(int oid);

    /**
     * 查询所有的活动
     * @return活动集合
     */
    public List<Activity> findAllActivities();

    /**
     * 通过活动的id更新活动的签到人数
     * @param id
     */
    public void updateCheckinNoById(int id,int checkinNo);

    /**
     * 通过活动id更新活动的是否可报名
     * @param id
     */
    public void updateIsApplyById(int id);

    /**
     * 通过活动id更新活动的状态
     * @param id
     */
    public void updateStateById(int id,int state);

    /**
     * 通过活动的id查询活动的状态
     * @param id
     */
    public int  findStateById(int id);

    /**
     * 通过活动的状态查找活动
     * @param state
     * @return 活动集合
     */
    public List<Activity> findActivityByState(int state);
}

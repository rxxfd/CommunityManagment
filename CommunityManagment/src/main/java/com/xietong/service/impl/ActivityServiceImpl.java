/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ActivityServiceImpl
 * Author:   hxq
 * Date:     2019/5/30 18:37
 * Description: 活动服务层实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Activity;
import com.xietong.dao.ActivityDao;
import com.xietong.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈活动服务层实现类〉
 *
 * @author hxq
 * @create 2019/5/30
 * @since 1.0.0
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityDao activityDao;
    /**
     * 通过活动id查找一个活动
     *
     * @param id 活动id
     * @return 一个活动
     */
    @Override
    public Activity findActivityById(int id) {
        return activityDao.findActivityById(id);
    }

    /**
     * 通过导师的id查找导师参与过的活动
     *
     * @param lid 导师id
     * @return 活动集合
     */
    @Override
    public List<Activity> findActivityByLecturerId(int lid) {
        return activityDao.findActivityByLecturerId(lid);
    }

    /**
     * 通过组织者的id查找组织者组织过的活动
     *
     * @param oid 组织者id
     * @return活动集合
     */
    @Override
    public List<Activity> findActivityByOrganizerId(int oid) {

        return activityDao.findActivityByOrganizerId(oid);
    }

    /**
     * 查询所有的活动
     *
     * @return活动集合
     */
    @Override
    public List<Activity> findAllActivities() {
        return activityDao.findAllActivities();
    }

    /**
     * 通过活动的id更新活动的签到人数
     *
     * @param id
     */
    @Override
    public void updateCheckinNoById(int id,int checkinNo) {
     activityDao.updateCheckinNoById(id,checkinNo);
    }

    /**
     * 通过活动id更新活动的是否可报名
     *
     * @param id
     */
    @Override
    public void updateIsApplyById(int id) {
        activityDao.updateIsApplyById(id);
    }

    /**
     * 通过活动id更新活动的状态
     *
     * @param id
     */
    @Override
    public void updateStateById(int id,int state) {
      activityDao.updateStateById(id,state);
    }

    /**
     * 通过活动的id查询活动的状态
     *
     * @param id
     */
    @Override
    public int findStateById(int id) {
        return activityDao.findStateById(id);
    }

    /**
     * 通过活动的状态查找活动
     *
     * @param state
     * @return 活动集合
     */
    @Override
    public List<Activity> findActivityByState(int state) {
        return activityDao.findActivityByState(state);
    }
}


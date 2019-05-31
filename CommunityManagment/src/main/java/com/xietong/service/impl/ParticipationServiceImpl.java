/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ParticipationServiceImpl
 * Author:   hxq
 * Date:     2019/5/29 16:32
 * Description: 学员参与活动信息的服务层实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Participation;
import com.xietong.dao.ParticipationDao;
import com.xietong.service.ParticipationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈学员参与活动信息的服务层实现类〉
 *
 * @author hxq
 * @create 2019/5/29
 * @since 1.0.0
 */
@Service
public class ParticipationServiceImpl implements ParticipationService {

    @Autowired
     private ParticipationDao participationDao;
    /**
     * 查找所有的学员参与活动信息
     *
     * @return 参与信息的集合
     */
    @Override
    public List<Participation> findAllParticipations() {
        return participationDao.findAllParticipations();
    }

    /**
     * 根据活动的id查找所有参与此活动学员活动参与信息
     *
     * @param aid 活动id
     * @return 参与信息的集合
     */
    @Override
    public List<Participation> findParticipationByActivityId(int aid) {
        return participationDao.findParticipationByActivityId(aid);
    }

    /**
     * 根据学员的id查找该学员参与过的活动
     *
     * @param sid 学员id
     * @return 参与信息的集合
     */
    @Override
    public List<Participation> findParticipationByStudentId(int sid) {
        return participationDao.findParticipationByStudentId(sid);
    }

    /**
     * 根据学员id查找学员没有签到的活动
     *
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    @Override
    public List<Participation> findNotSignParticipationByStudentId(int sid) {
        return participationDao.findNotSignParticipationByStudentId(sid);
    }

    /**
     * 根据学员id查找学员已经签到的活动
     *
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    @Override
    public List<Participation> findSignedParticipationByStudentId(int sid) {
        return participationDao.findSignedParticipationByStudentId(sid);
    }
}


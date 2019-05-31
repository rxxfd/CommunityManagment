package com.xietong.service;

import com.xietong.bean.Participation;

import java.util.List;

/**
 * 学员参与活动信息服务层接口
 * Created by hxq on 2019/5/29.
 */
public interface ParticipationService {
    /**
     * 查找所有的学员参与活动信息
     * @return 参与信息的集合
     */
    public List<Participation> findAllParticipations();

    /**
     * 根据活动的id查找所有参与此活动学员活动参与信息
     * @param aid 活动id
     * @return 参与信息的集合
     */
    public List<Participation> findParticipationByActivityId(int aid);

    /**
     * 根据学员的id查找该学员参与过的活动
     * @param sid 学员id
     * @return 参与信息的集合
     */
    public  List<Participation> findParticipationByStudentId(int sid);

    /**
     * 根据学员id查找学员没有签到的活动
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    public List<Participation> findNotSignParticipationByStudentId(int sid);

    /**
     * 根据学员id查找学员已经签到的活动
     * @param sid 学员的id
     * @return 参与信息的集合
     */
    public List<Participation> findSignedParticipationByStudentId(int sid);
}

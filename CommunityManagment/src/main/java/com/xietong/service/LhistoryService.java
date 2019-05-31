package com.xietong.service;

import com.xietong.bean.Lhistory;

import java.util.List;

/**导师历史活动服务层接口
 * Created by hxq on 2019/5/30.
 */
public interface LhistoryService {

    /**
     * 查询所有导师历史活动的信息
     * @return 导师历史活动集合
     */
    public List<Lhistory> findAllLhistory();

    /**
     * 通过活动id查找导师历史活动
     * @param aid
     * @return导师历史活动集合
     */
    public List<Lhistory> findLhistoryByActivityId(int aid);

    /**
     * 通过导师id查找导师历史活动
     * @param lid
     * @return导师历史活动集合
     */
    public List<Lhistory> findLhistoryByLecturerId(int lid);
}

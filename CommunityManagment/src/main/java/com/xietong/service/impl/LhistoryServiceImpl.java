/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LhistoryServiceImpl
 * Author:   hxq
 * Date:     2019/5/30 18:43
 * Description: 导师历史活动服务层实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Lhistory;
import com.xietong.dao.LhistoryDao;
import com.xietong.service.LhistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈导师历史活动服务层实现类〉
 *
 * @author hxq
 * @create 2019/5/30
 * @since 1.0.0
 */
@Service
public class LhistoryServiceImpl implements LhistoryService {

    @Autowired
    private LhistoryDao lhistoryDao;
    /**
     * 查询所有导师历史活动的信息
     *
     * @return 导师历史活动集合
     */
    @Override
    public List<Lhistory> findAllLhistory() {
        return lhistoryDao.findAllLhistory();
    }

    /**
     * 通过活动id查找导师历史活动
     *
     * @param aid
     * @return导师历史活动集合
     */
    @Override
    public List<Lhistory> findLhistoryByActivityId(int aid) {
        return lhistoryDao.findLhistoryByActivityId(aid);
    }

    /**
     * 通过导师id查找导师历史活动
     *
     * @param lid
     * @return导师历史活动集合
     */
    @Override
    public List<Lhistory> findLhistoryByLecturerId(int lid) {
        return lhistoryDao.findLhistoryByLecturerId(lid);
    }
}


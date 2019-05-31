/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: OrganizerServiceImpl
 * Author:   hxq
 * Date:     2019/5/29 15:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Organizer;
import com.xietong.dao.LhistoryDao;
import com.xietong.dao.OrganizerDao;
import com.xietong.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author hxq
 * @create 2019/5/29
 * @since 1.0.0
 */
@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Autowired
    private OrganizerDao organizerDao;
    /**
     * 通过组织者的id删除一个组织者的账号
     * @param id 组织者的id
     */
    @Override
    public void deleteOrganizerById(int id) {
          organizerDao.deleteOrganizerById(id);
    }

    /**
     * 通过id和password查找一个组织者，用于登陆
     * @param id  账号
     * @param password  密码
     * @return
     */
    @Override
    public Organizer findOrganizerByIdPass(int id, String password) {
        return organizerDao.findOrganizerByIdPass(id,password);
    }

    /**
     * 通过组织者id查找flag验证是否是组织者老大
     *
     * @param id
     * @return 布尔值
     */
    @Override
    public boolean isBossById(int id) {
        return organizerDao.isBossById(id);
    }
}


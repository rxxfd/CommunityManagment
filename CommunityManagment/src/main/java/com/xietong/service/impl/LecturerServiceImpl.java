/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LecturerServiceImpl
 * Author:   hxq
 * Date:     2019/5/29 16:20
 * Description: 导师服务层实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Lecturer;
import com.xietong.dao.LecturerDao;
import com.xietong.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈导师服务层实现类〉
 *
 * @author hxq
 * @create 2019/5/29
 * @since 1.0.0
 */
@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    private LecturerDao lecturerDao;
    /**
     * 根据导师的id删除一个导师的账号
     * @param id 导师账户
     */
    @Override
    public void deleteLecturerById(int id) {
         lecturerDao.deleteLecturerById(id);
    }

    /**
     * 查找所有的导师的信息
     * @return 所有导师的集合
     */
    @Override
    public List<Lecturer> findAllLecturers() {
        return lecturerDao.findAllLecturers();
    }

    /**
     * 通过id和password查找一个导师，用于登陆
     * @param id 导师id
     * @param password 导师密码
     * @return
     */
    @Override
    public Lecturer findLecturerByIdPass(int id, String password) {
        return lecturerDao.findLecturerByIdPass(id,password);
    }

    /**
     * 更新导师的信息
     * @param lecturer 导师封装类
     */
    @Override
    public void updateLecturer(Lecturer lecturer) {
        lecturerDao.updateLecturer(lecturer);
    }

    /**8
     * 通过导师id更新导师的认证是否通过
     * @param id 导师id
     */
    @Override
    public void updateQualifiedById(int id) {
      lecturerDao.updateQualifiedById(id);
    }
}


/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StudentServiceImpl
 * Author:   hxq
 * Date:     2019/5/29 17:01
 * Description: 学员信息服务层实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xietong.service.impl;

import com.xietong.bean.Student;
import com.xietong.dao.StudentDao;
import com.xietong.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈学员信息服务层实现类〉
 *
 * @author hxq
 * @create 2019/5/29
 * @since 1.0.0
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;
    /**
     * 查找所有的学员
     *
     * @return 学员信息的集合
     */
    @Override
    public List<Student> findAllStudents() {
        return studentDao.findAllStudents();
    }

    /**
     * 通过学员的id查找学员的积分
     *
     * @param id 学员
     * @return int 积分
     */
    @Override
    public int findCreditsById(int id) {
        return studentDao.findCreditsById(id) ;
    }

    /**
     * 通过id和password查找一个学员，用于登陆
     *
     * @param id       学员id
     * @param password 学员密码
     * @return 学员信息
     */
    @Override
    public Student findStudentByIdPass(int id, String password) {
        return studentDao.findStudentByIdPass(id,password);
    }

    /**
     * 更新学员的积分，加积分
     *
     * @param id      学员id
     * @param Credits
     */
    @Override
    public void updateCreditsByIdCredits(int id, int Credits) {
       studentDao.updateCreditsByIdCredits(id,Credits);
    }
}


package com.xietong.dao;

import com.xietong.bean.Lecturer;

import java.util.List;

/**导师持久层Dao接口
 * Created by hxq on 2019/5/29.
 */
public interface LecturerDao {
    /**
     * 根据导师的id删除一个导师的账号
     * @param id 导师账户
     */
    public void deleteLecturerById(int id);

    /**
     * 查找所有的导师的信息
     * @return 所有导师的集合
     */
    public List<Lecturer> findAllLecturers();

    /**
     * 通过id和password查找一个导师，用于登陆
     * @param id 导师id
     * @param password 导师密码
     * @return
     */
    public Lecturer findLecturerByIdPass(int id,String password);

    /**
     * 更新导师的信息
     * @param lecturer 导师封装类
     */
    public void updateLecturer(Lecturer lecturer);

    /**8
     * 通过导师id更新导师的认证是否通过
     * @param id 导师id
     */
    public void updateQualifiedById(int id);

}

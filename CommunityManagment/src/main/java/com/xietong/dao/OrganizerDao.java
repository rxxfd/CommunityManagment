package com.xietong.dao;

import com.xietong.bean.Organizer;

/**组织者持久层Dao接口
 * Created by hxq on 2019/5/29.
 */
public interface OrganizerDao {

    /**
     * 通过组织者的id删除一个组织者的账号
     * @param id 组织者的id
     */
    public void deleteOrganizerById(int id);

    /**
     * 通过id和password查找一个组织者，用于登陆
     * @param id  账号
     * @param password  密码
     * @return
     */
    public Organizer findOrganizerByIdPass(int id, String password);

    /**
     * 通过组织者id查找flag验证是否是组织者老大
     * @param id
     * @return
     */
    public boolean isBossById(int id);
}

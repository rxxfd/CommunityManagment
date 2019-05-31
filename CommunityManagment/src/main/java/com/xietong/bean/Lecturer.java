package com.xietong.bean;

/**
 * 导师类有如下属性：community代表导师所在社区，类型int；
 * credits代表导师积分，类型int；
 * name代表导师姓名，类型String；
 * password代表导师登录密码，类型String；
 * phone代表导师手机号码，类型String;
 * qualified代表导师是否已认证，类型Boolean;
 * resume代表导师简介，类型String。
 * 导师类有如下方法：SetId（）设置导师编号，SetName（）设置导师姓名......
 * @author ZhangMingShuo
 */
public class Lecturer {
	private int id;
	private String name;
	private String password;
	private String phone;
	private Boolean qualified;
	private String community;
	private int credits;
	private String resume;
	public Lecturer() {
		this.credits = 100;
	}
	/**
	 * 获取导师id
	 * @return 导师id
	 */
	public int getId() {
		return id;
	}
	/**
	 * 设置导师id
	 * @param id 导师id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * 获取导师姓名
	 * @return 导师姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置导师姓名
	 * @param name 导师姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取导师登录密码
	 * @return 导师密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置导师登录密码
	 * @param password 导师登录密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取导师电话
	 * @return 导师电话
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置导师电话
	 * @param phone 导师电话
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 *
	 * @return 返回导师是否认证
	 */
	public Boolean getQualified() {
		return qualified;
	}
	/**
	 *
	 * 设置导师是否认证
	 * @param qualified 导师是否认证
	 */
	public void setQualified(Boolean qualified) {
		this.qualified = qualified;
	}
	/**
	 *
	 * @return 返回导师所在社区
	 */
	public String getCommunity() {
		return community;
	}
	/**
	 *
	 * @param community 导师所在社区
	 */
	public void setCommunity(String community) {
		this.community = community;
	}

	/**
	 *
	 * @return 返回导师积分
	 */
	public int getCredits() {
		return credits;
	}
	/**
	 * 设置导师积分
	 * @param credits 导师积分
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	/**
	 * @return 获得导师简介
	 */
	public String getResume() {
		return resume;
	}
	/**
	 *
	 * @param resume 导师简介
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Lecturer [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", qualified="
				+ qualified + ", community=" + community + ", credits=" + credits + ", resume=" + resume + "]";
	}
}


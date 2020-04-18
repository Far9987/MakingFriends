package cn.hk.mf.dao;

import java.util.List;

import cn.hk.mf.entity.User;

public interface UserDao {
	public List<User> findAll();
	public User findById(String id);
	public User findByName(String name);
	public int save(User u);
	public int updateBasicInfo(User u);
	public int updateInnerVoice(User u);
	public int updateCondition(User u);
	public int findIdByName(String username);
}

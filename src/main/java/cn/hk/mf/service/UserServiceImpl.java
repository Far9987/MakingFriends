package cn.hk.mf.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.hk.mf.dao.UserDao;
import cn.hk.mf.entity.MfResult;
import cn.hk.mf.entity.User;
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserDao dao;
	public MfResult findAll(){
		List<User> users=dao.findAll();
		MfResult result=new MfResult();
		result.setData(users);
		result.setStatus(0);
		result.setMsg("��ѯ�û��б�ɹ�");
		return result;
	}
	public MfResult saveUser(String username,String truename,String password,
			String age,String sex,String tel){
		MfResult result=new MfResult();
		
		User u=dao.findByName(truename);
		if(u!=null){
			result.setMsg("���û����ѱ�ռ��");
			result.setStatus(1);
			return result;
		}
		u=new User();
		u.setUsername(username);
		u.setTrueName(truename);
		u.setPassword(password);
		u.setAge(Integer.parseInt(age));
		u.setSex(sex);
		u.setTel(tel);
		dao.save(u);
		int userId=dao.findIdByName(username);
		result.setStatus(0);
		result.setData(userId);
		result.setMsg("ע��ɹ�");
		return result;
	}
	public MfResult updateBasicInfo(String height,String eduLevel,String maritalStatus,String salary,
			String province,String city,String housing,String carStatus,String userId){
		System.out.println(dao);
		User u=dao.findById(userId);
		u.setHeight(Integer.parseInt(height));
		u.setEduLevel(Integer.parseInt(eduLevel));
		u.setMaritalStatus(Integer.parseInt(maritalStatus));
		u.setSalary(Integer.parseInt(salary));
		u.setProvince(Integer.parseInt(province));
		u.setCity(Integer.parseInt(city));
		u.setHousing(Integer.parseInt(housing));
		u.setCarStatus(Integer.parseInt(carStatus));
		MfResult result=new MfResult();
		result.setStatus(0);
		result.setMsg("���������Ϣ�ɹ�");
		return result;
	}
	public MfResult updateCondition(String heightCon,String eduCon,String maritalCon,
			String provinceCon,String cityCon,String userId){
		User u=dao.findById(userId);
		u.setHeightCon(Integer.parseInt(heightCon));
		u.setEduCon(Integer.parseInt(eduCon));
		u.setMaritalCon(Integer.parseInt(maritalCon));
		u.setProvinceCon(Integer.parseInt(provinceCon));
		u.setCityCon(Integer.parseInt(cityCon));
		MfResult result=new MfResult();
		result.setStatus(0);
		result.setMsg("���潻�������ɹ�");
		return result;
	}
	public MfResult updateInnerVoice(String innerVoice,String userId){
		User u=dao.findById(userId);
		u.setInnerVoice(innerVoice);
		MfResult result=new MfResult();
		result.setStatus(0);
		result.setMsg("���Ķ��ױ���ɹ�");
		return result;
	}
	public MfResult login(String username,String password){
		MfResult result=new MfResult();
		User u=dao.findByName(username);
		if(u==null){
			result.setStatus(1);
			result.setMsg("���޴��ˣ�");
			return result;
		}
		if(!u.getPassword().equals(password)){
			result.setStatus(2);
			result.setMsg("�������");
			return result;
		}
		result.setStatus(0);
		result.setMsg("��½�ɹ�");
		result.setData(u.getUserId());
		return result;
	}
}

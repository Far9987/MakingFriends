package cn.hk.mf.service;

import cn.hk.mf.entity.MfResult;

public interface UserService {
	public MfResult findAll();
	public MfResult saveUser(String username,String truename,String password,
			String age,String sex,String tel);
	public MfResult updateBasicInfo(String height,String eduLevel,String maritalStatus,String salary,
			String province,String city,String housing,String carStatus,String userId);
	public MfResult updateCondition(String heightCon,String eduCon,String maritalCon,
			String provinceCon,String cityCon,String userId);
	public MfResult updateInnerVoice(String innerVoice,String userId);
	public MfResult login(String username,String password);
}

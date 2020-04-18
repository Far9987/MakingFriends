package cn.hk.mf.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.hk.mf.entity.MfResult;
import cn.hk.mf.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService service;
	@RequestMapping("/findAll.do")
	@ResponseBody
	public MfResult findUsers(){
		MfResult result=service.findAll();
		return result;
	}
	@RequestMapping("/regist.do")
	@ResponseBody
	public MfResult regist(String username,String truename,String password,
			String age,String sex,String tel){
		System.out.println("username:"+username);
		MfResult result=service.saveUser(username, truename, password, age, sex, tel);
		return result;
	}
	@RequestMapping("/updateBasicInfo.do")
	@ResponseBody
	public MfResult updateBasicInfo(String height,String eduLevel,String maritalStatus,
		String salary,String province,String city,String housing,String carStatus,String userId){
		System.out.println(userId+","+height);
		MfResult result=service.updateBasicInfo(height, eduLevel, maritalStatus, 
				salary, province, city, housing, carStatus, userId);
		return result;
	}
	@RequestMapping("/updateInnerVoice.do")
	@ResponseBody
	public MfResult updateInnerVoice(String innerVoice,String userId){
		MfResult result=service.updateInnerVoice(innerVoice, userId);
		return result;
	}
	@RequestMapping("/updateCondition.do")
	@ResponseBody
	public MfResult updateCondition(String heightCon,String eduCon,String maritalCon,
			String provinceCon,String cityCon,String userId){
		MfResult result=service.updateCondition(heightCon, eduCon, maritalCon,
				provinceCon, cityCon, userId);
		return result;
	}
	@RequestMapping("/login.do")
	@ResponseBody
	public MfResult login(String username,String password){
		MfResult result=service.findAll();
		System.out.println("µÇÂ½³É¹¦");
		return result;
	}
}

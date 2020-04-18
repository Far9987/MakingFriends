package cn.hk.mf.entity;

import java.io.Serializable;

public class User implements Serializable {
	private Integer userId;
	private String username;
	private String trueName;
	private String password;
	private Integer age;
	private String sex;
	private String tel;
	private Integer height;
	private Integer eduLevel;
	private Integer maritalStatus;
	private Integer salary;
	private Integer province;
	private Integer city;
	private Integer housing;
	private Integer carStatus;
	private String innerVoice;
	private Integer heightCon;
	private Integer eduCon;
	private Integer maritalCon;
	private Integer provinceCon;
	private Integer cityCon;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getEduLevel() {
		return eduLevel;
	}
	public void setEduLevel(Integer eduLevel) {
		this.eduLevel = eduLevel;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getHousing() {
		return housing;
	}
	public void setHousing(Integer housing) {
		this.housing = housing;
	}
	public Integer getCarStatus() {
		return carStatus;
	}
	public void setCarStatus(Integer carStatus) {
		this.carStatus = carStatus;
	}
	public String getInnerVoice() {
		return innerVoice;
	}
	public void setInnerVoice(String innerVoice) {
		this.innerVoice = innerVoice;
	}
	public Integer getHeightCon() {
		return heightCon;
	}
	public void setHeightCon(Integer heightCon) {
		this.heightCon = heightCon;
	}
	public Integer getEduCon() {
		return eduCon;
	}
	public void setEduCon(Integer eduCon) {
		this.eduCon = eduCon;
	}
	public Integer getMaritalCon() {
		return maritalCon;
	}
	public void setMaritalCon(Integer maritalCon) {
		this.maritalCon = maritalCon;
	}
	public Integer getProvinceCon() {
		return provinceCon;
	}
	public void setProvinceCon(Integer provinceCon) {
		this.provinceCon = provinceCon;
	}
	public Integer getCityCon() {
		return cityCon;
	}
	public void setCityCon(Integer cityCon) {
		this.cityCon = cityCon;
	}
	public Integer getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}

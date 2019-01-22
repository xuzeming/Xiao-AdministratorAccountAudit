package com.zl.SecuritiesSystem.pojo;

import java.io.Serializable;

public class UserCenters implements Serializable {
	
	private static final long serialVersionUID = -4922653031158123698L;

    private Integer userId;

    private Integer userStatusId;

    private String userLoginName;

    private String netName;

    private String userTel;

    private String userPwd;

    private Short accountNum;

    private String capitalPwd;

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

	public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserStatusId() {
        return userStatusId;
    }

    public void setUserStatusId(Integer userStatusId) {
        this.userStatusId = userStatusId;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName == null ? null : userLoginName.trim();
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName == null ? null : netName.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public Short getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Short accountNum) {
        this.accountNum = accountNum;
    }

    public String getCapitalPwd() {
        return capitalPwd;
    }

    public void setCapitalPwd(String capitalPwd) {
        this.capitalPwd = capitalPwd == null ? null : capitalPwd.trim();
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1 == null ? null : a1.trim();
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2 == null ? null : a2.trim();
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3 == null ? null : a3.trim();
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4 == null ? null : a4.trim();
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5 == null ? null : a5.trim();
    }

	@Override
	public String toString() {
		return "UserCenters [userId=" + userId + ", userStatusId=" + userStatusId + ", userLoginName=" + userLoginName
				+ ", netName=" + netName + ", userTel=" + userTel + ", userPwd=" + userPwd + ", accountNum="
				+ accountNum + ", capitalPwd=" + capitalPwd + ", a1=" + a1 + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4
				+ ", a5=" + a5 + "]";
	}

}
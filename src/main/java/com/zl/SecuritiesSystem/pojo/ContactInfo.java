package com.zl.SecuritiesSystem.pojo;

import java.io.Serializable;

public class ContactInfo implements Serializable {
	
	private static final long serialVersionUID = -4826170900194088460L;

	private BankCard bankCard;
	
	private UserBaseInfo userBaseInfo;
	
	private UserCenters userCenters;
	
	private UserIdentification userIdentification;

	private Integer userId;

    private String email;

    private String zipCode;

    private String workPhone;

    private String fax;

    private String contectAddress;

    private String workAddress;

    private String comAddress;

    private String a1;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

	
    public BankCard getBankCard() {
		return bankCard;
	}

	public void setBankCard(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public UserBaseInfo getUserBaseInfo() {
		return userBaseInfo;
	}

	public void setUserBaseInfo(UserBaseInfo userBaseInfo) {
		this.userBaseInfo = userBaseInfo;
	}

	public UserCenters getUserCenters() {
		return userCenters;
	}

	public void setUserCenters(UserCenters userCenters) {
		this.userCenters = userCenters;
	}

	public UserIdentification getUserIdentification() {
		return userIdentification;
	}

	public void setUserIdentification(UserIdentification userIdentification) {
		this.userIdentification = userIdentification;
	}

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone == null ? null : workPhone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getContectAddress() {
        return contectAddress;
    }

    public void setContectAddress(String contectAddress) {
        this.contectAddress = contectAddress == null ? null : contectAddress.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress == null ? null : comAddress.trim();
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
		return "ContactInfo [bankCard=" + bankCard + ", userBaseInfo=" + userBaseInfo + ", userCenters=" + userCenters
				+ ", userIdentification=" + userIdentification + ", userId=" + userId + ", email=" + email
				+ ", zipCode=" + zipCode + ", workPhone=" + workPhone + ", fax=" + fax + ", contectAddress="
				+ contectAddress + ", workAddress=" + workAddress + ", comAddress=" + comAddress + ", a1=" + a1
				+ ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}
    
}
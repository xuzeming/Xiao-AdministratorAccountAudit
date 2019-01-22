package com.zl.SecuritiesSystem.pojo;

import java.io.Serializable;

public class StatusInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8150227558461276052L;

	private Integer openStatusId;

    private Integer userId;

    private Integer identityAudit;

    private Integer infoAudit;

    private Integer viewAudit;

    private Integer openAccount;

    private String submitTime;

    private String a2;

    private String a3;

    private String a4;

    private String a5;

    public Integer getOpenStatusId() {
        return openStatusId;
    }

    public void setOpenStatusId(Integer openStatusId) {
        this.openStatusId = openStatusId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getIdentityAudit() {
        return identityAudit;
    }

    public void setIdentityAudit(Integer identityAudit) {
        this.identityAudit = identityAudit;
    }

    public Integer getInfoAudit() {
        return infoAudit;
    }

    public void setInfoAudit(Integer infoAudit) {
        this.infoAudit = infoAudit;
    }

    public Integer getViewAudit() {
        return viewAudit;
    }

    public void setViewAudit(Integer viewAudit) {
        this.viewAudit = viewAudit;
    }

    public Integer getOpenAccount() {
        return openAccount;
    }

    public void setOpenAccount(Integer openAccount) {
        this.openAccount = openAccount;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
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
		return "StatusInfo [openStatusId=" + openStatusId + ", userId=" + userId + ", identityAudit=" + identityAudit
				+ ", infoAudit=" + infoAudit + ", viewAudit=" + viewAudit + ", openAccount=" + openAccount
				+ ", submitTime=" + submitTime + ", a2=" + a2 + ", a3=" + a3 + ", a4=" + a4 + ", a5=" + a5 + "]";
	}

}
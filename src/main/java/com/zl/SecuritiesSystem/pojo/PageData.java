package com.zl.SecuritiesSystem.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PageData implements Serializable {
	
	private static final long serialVersionUID = 6343957201568465110L;
	
	private String User_Id;
	
	private String User_Name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date Start_Submitdate;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date End_Submitdate;
	
	private Integer Identity_Audit;
	
	private Integer Info_Audit;
	
	private Integer View_Audit;
	
	private Integer pageIndex = 1;
	
	private Integer pageSize = 5;
	
	private Integer totalCount;
	
	private Integer totalPage;

	private Integer start;
	
	private Integer end;
	
	private List<UserIdentification> userIdentifications;

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		this.User_Id = user_Id;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		this.User_Name = user_Name;
	}

	public Date getStart_Submitdate() {
		return Start_Submitdate;
	}

	public void setStart_Submitdate(Date start_Submitdate) {
		this.Start_Submitdate = start_Submitdate;
	}

	public Date getEnd_Submitdate() {
		return End_Submitdate;
	}

	public void setEnd_Submitdate(Date end_Submitdate) {
		this.End_Submitdate = end_Submitdate;
	}

	public Integer getIdentity_Audit() {
		return Identity_Audit;
	}

	public void setIdentity_Audit(Integer identity_Audit) {
		this.Identity_Audit = identity_Audit;
	}

	public Integer getInfo_Audit() {
		return Info_Audit;
	}

	public void setInfo_Audit(Integer info_Audit) {
		this.Info_Audit = info_Audit;
	}

	public Integer getView_Audit() {
		return View_Audit;
	}

	public void setView_Audit(Integer view_Audit) {
		this.View_Audit = view_Audit;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getStart() {
		return (pageIndex-1)*pageSize+1;
	}

	public Integer getEnd() {
		return pageIndex*pageSize;
	}

	public List<UserIdentification> getUserIdentifications() {
		return userIdentifications;
	}

	public void setUserIdentifications(List<UserIdentification> userIdentifications) {
		this.userIdentifications = userIdentifications;
	}

	@Override
	public String toString() {
		return "PageData [User_Id=" + User_Id + ", User_Name=" + User_Name + ", Start_Submitdate=" + Start_Submitdate
				+ ", End_Submitdate=" + End_Submitdate + ", Identity_Audit=" + Identity_Audit + ", Info_Audit="
				+ Info_Audit + ", View_Audit=" + View_Audit + ", pageIndex=" + pageIndex + ", pageSize=" + pageSize
				+ ", totalCount=" + totalCount + ", totalPage=" + totalPage + ", start=" + start + ", end=" + end
				+ ", userIdentifications=" + userIdentifications + "]";
	}
	
	
}

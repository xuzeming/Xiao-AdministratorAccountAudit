package com.zl.SecuritiesSystem.mapper;

import java.util.List;

import com.zl.SecuritiesSystem.pojo.ContactInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;

public interface AuditMapper {

	//插入开户账号
	void insertAcount(String id);

	//更改开户状态
	void openAcount(String id);
	
	//查询数据数量
	Integer count(PageData pageData);
	
	//查询数据
	List<UserIdentification> getDatas(PageData pageData);

	//获取用户个人身份信息
	UserIdentification getIdentificationInfo(String id);

	//获取用户基本信息
	ContactInfo getInformation(String id);
	
	//获取用户视频信息
	UserBaseInfo getVideoPath(String id);

	//Identity通过审核
	void passIdentity(String id);
	//Info通过审核
	void passInfo(String id);
	//View通过审核
	void passView(String id);
	//Identity审核不通过
	void passNotIdentity(String id);
	//Info审核不通过
	void passNotInfo(String id);
	//View审核不通过
	void passNotView(String id);

}

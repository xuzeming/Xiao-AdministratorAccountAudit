package com.zl.SecuritiesSystem.mapper;

import java.util.List;

import com.zl.SecuritiesSystem.pojo.BaseInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;

public interface AuditMapper {
	
	//查询数据数量
	Integer count(PageData pageData);
	
	//查询数据
	List<UserIdentification> getDatas(PageData pageData);

	//获取用户个人身份信息
	UserIdentification getIdentificationInfo(String id);

	//获取用户基本信息
	BaseInfo getInformation(String id);
	
	//获取用户视频信息
	UserBaseInfo getVideoPath(String id);

	//通过审核
	void pass(String identity);
	//审核不通过
	void passNot(String identity);

}

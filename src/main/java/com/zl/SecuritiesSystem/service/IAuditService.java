package com.zl.SecuritiesSystem.service;

import com.zl.SecuritiesSystem.pojo.ContactInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;

public interface IAuditService {
	
	//用户审核数据
	PageData getDatas(PageData pageData);

	//获取用户个人身份信息
	UserIdentification getIdentificationInfo(String id);
	
	//获取用户基本信息
	ContactInfo getInformation(String id);
	
	//获取用户视频信息
	UserBaseInfo getVideoPath(String id);

	//审查是否通过
	void pass(String flag, String identity, String id);

	//开户
	void openAcount(String id);

}

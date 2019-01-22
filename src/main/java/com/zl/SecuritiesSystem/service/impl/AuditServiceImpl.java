package com.zl.SecuritiesSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.SecuritiesSystem.mapper.AuditMapper;
import com.zl.SecuritiesSystem.pojo.BaseInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;
import com.zl.SecuritiesSystem.service.IAuditService;
@Service
public class AuditServiceImpl implements IAuditService {
	@Autowired
	AuditMapper auditMapper;

	//用户审核数据
	public PageData getDatas(PageData pageData) {
		
		//封装页面数据的类
		PageData page = new PageData();
		
		page.setTotalCount(auditMapper.count(pageData));
		
		page.setUserIdentifications(auditMapper.getDatas(pageData));
		
		return page;
	}

	//获取用户个人身份信息
	public UserIdentification getIdentificationInfo(String id) {
		return auditMapper.getIdentificationInfo(id);
	}

	//获取用户基本信息
	public BaseInfo getInformation(String id) {
		return auditMapper.getInformation(id);
	}
	
	//获取用户视频信息
	public UserBaseInfo getVideoPath(String id) {
		return auditMapper.getVideoPath(id);
	}

	//审查是否通过
	public void pass(String flag, String identity) {
		
		if ("1".equals(flag)) {
			auditMapper.pass(identity);
		}else {
			auditMapper.passNot(identity);
		}
		
	}
	
}

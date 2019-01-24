package com.zl.SecuritiesSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.SecuritiesSystem.mapper.AuditMapper;
import com.zl.SecuritiesSystem.pojo.ContactInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;
import com.zl.SecuritiesSystem.service.IAuditService;
@Service
public class AuditServiceImpl implements IAuditService {
	@Autowired
	AuditMapper auditMapper;

	//开户
	public void openAcount(String id) {
		//插入开户账号
		auditMapper.insertAcount(id);
		//更改开户状态
		auditMapper.openAcount(id);
	}

	//用户审核数据
	public PageData getDatas(PageData pageData) {
		
		int totalCount = auditMapper.count(pageData);
		
		List<UserIdentification> datas = auditMapper.getDatas(pageData);
		
		pageData.setTotalCount(totalCount);
		
		int num = totalCount/pageData.getPageSize();
		pageData.setTotalPage(totalCount%pageData.getPageSize() ==0 ? num : num+1);
		
		pageData.setUserIdentifications(datas);
		
		return pageData;
	}

	//获取用户个人身份信息
	public UserIdentification getIdentificationInfo(String id) {
		return auditMapper.getIdentificationInfo(id);
	}

	//获取用户基本信息
	public ContactInfo getInformation(String id) {
		return auditMapper.getInformation(id);
	}
	
	//获取用户视频信息
	public UserBaseInfo getVideoPath(String id) {
		return auditMapper.getVideoPath(id);
	}

	//审查是否通过
	public void pass(String flag, String identity, String id ) {
		
		if ("1".equals(flag)) {
			if ("identity".equals(identity)) {
				auditMapper.passIdentity(id);
			}else if ("info".equals(identity)) {
				auditMapper.passInfo(id);
			}else {
				auditMapper.passView(id);
			}
		}else {
			if ("identity".equals(identity)) {
				auditMapper.passNotIdentity(id);
			}else if ("info".equals(identity)) {
				auditMapper.passNotInfo(id);
			}else {
				auditMapper.passNotView(id);
			}
		}
		
	}

	
}

package com.zl.SecuritiesSystem.web;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zl.SecuritiesSystem.pojo.ContactInfo;
import com.zl.SecuritiesSystem.pojo.PageData;
import com.zl.SecuritiesSystem.pojo.UserBaseInfo;
import com.zl.SecuritiesSystem.pojo.UserIdentification;
import com.zl.SecuritiesSystem.service.IAuditService;

@RestController
public class AuditController {
	@Autowired
	IAuditService auditServiceImpl;
	
	//用户
	@GetMapping("/openAcount.action")
	public String openAcount(String id) throws SQLException {
System.err.println(id);
		auditServiceImpl.openAcount(id);
		return "ok";
	}
	
	//用户审核数据
	@GetMapping("/getDatas.action")
	public PageData getDatas(PageData pageData) throws SQLException {
System.err.println("--"+pageData);		
		PageData datas = auditServiceImpl.getDatas(pageData);
		return datas;
	}
	
	//获取用户身份信息
	@GetMapping("/getIdentificationInfo.action")
	public UserIdentification getIdentificationInfo(String id) throws SQLException {
		UserIdentification datas =  auditServiceImpl.getIdentificationInfo(id);
		return datas;
	}
	
	//获取用户基础信息
	@GetMapping("/getInformation.action")
	public ContactInfo getInformation(String id) throws SQLException {
System.err.println("1111"+id);
		ContactInfo datas =  auditServiceImpl.getInformation(id);
System.err.println(datas);		
		return datas;
	}
	
	//获取用户视频信息
	@GetMapping("/getVideoPath.action")
	public String getVideoPath(String id) throws SQLException {
		UserBaseInfo datas =  auditServiceImpl.getVideoPath(id);
		String viewPathString = datas.getViewName();
		return viewPathString;
	}
	
	//修改审核状态
	@GetMapping("/pass.action")
	public String pass(String flag, String identity, String id) throws SQLException {
System.err.println("标志:"+flag+"  内容: "+identity+"  id:"+id);
		auditServiceImpl.pass(flag,identity,id);
		return "ok";
	}
	
}

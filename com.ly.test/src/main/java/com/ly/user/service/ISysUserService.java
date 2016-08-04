package com.ly.user.service;

import com.ly.user.domain.SysUser;
import java.util.List;

public interface ISysUserService {

	void addSysUser(SysUser sysUser);
	
	List<SysUser> findAll();
	
	SysUser findById(Integer sysUserId);
}

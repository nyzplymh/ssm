package com.ly.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ly.user.dao.SysUserMapper;
import com.ly.user.domain.SysUser;
import com.ly.user.service.ISysUserService;

@Service
@Transactional
public class SysUserService implements ISysUserService {

	
	@Autowired
	private SysUserMapper userMapper; 
	
	public void addSysUser(SysUser sysUser) {
		userMapper.insert(sysUser);
	}

	public List<SysUser> findAll() {
		return null;
	}

	public SysUser findById(Integer sysUserId) {
		return userMapper.selectByPrimaryKey(sysUserId);
	}

}

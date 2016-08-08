package com.ly.commons;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import com.ly.user.service.ISysUserService;

@Component
public class ServiceManager implements InitializingBean {

	private static boolean inited;
	
	public static ISysUserService sysUserService;

	public void afterPropertiesSet() throws Exception {
		inited = true;
		System.out.println("------------------------------serviceManager--"+inited);
	}
	
	public static boolean isInited() {
		return inited;
	}

	public void setInited(boolean inited) {
		ServiceManager.inited = inited;
	}

	public void setSysUserService(ISysUserService sysUserService) {
		ServiceManager.sysUserService = sysUserService;
	}
	
	public ISysUserService getSysUserService() {
		return sysUserService;
	}
}

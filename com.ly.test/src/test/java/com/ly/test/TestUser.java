package com.ly.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ly.user.domain.SysUser;
import com.ly.user.service.impl.SysUserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"spring/applicationContext-mvc.xml","spring/applicationContext-datasource.xml",
		"spring/applicationContext-tx.xml","spring/applicationContext-mybatis.xml"})
public class TestUser {

	@Autowired
	private SysUserService sysUserService;
	
	@Test
	public void testGetById(){
		Integer sysUserId = 61565;
		SysUser user = sysUserService.findById(sysUserId );
		System.out.println(user.getLoginId());
	}
	

}

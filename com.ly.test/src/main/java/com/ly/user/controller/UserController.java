package com.ly.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ly.commons.ServiceManager;
import com.ly.user.domain.SysUser;

@Controller
@RequestMapping("/user")
public class UserController {

//	@Autowired
//	private ISysUserService sysUserService;
	
	
	@RequestMapping(value={"/getUserInfo/{sysUserId}"} ,method=RequestMethod.GET)
	public String getUser(ModelMap model ,@PathVariable("sysUserId") Integer sysUserId){
		List<SysUser> list = new ArrayList<SysUser>();
		 SysUser user = ServiceManager.sysUserService.findById(sysUserId);
		 list.add(user);
		 model.put("list", list);
		 model.addAttribute("userList", list);
		 return "success";
	}
	
}

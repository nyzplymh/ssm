package com.ly.user.dao;

import com.ly.user.domain.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer sysUserId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer sysUserId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
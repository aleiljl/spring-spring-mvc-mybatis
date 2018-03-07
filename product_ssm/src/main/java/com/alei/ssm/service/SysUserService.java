package com.alei.ssm.service;

import com.alei.ssm.entity.system.SysUser;
import org.springframework.stereotype.Repository;

public interface SysUserService {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    SysUser loginAction(String loginName, String password);
}
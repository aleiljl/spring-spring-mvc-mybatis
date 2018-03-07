package com.alei.ssm.service.impl;

import com.alei.ssm.dao.system.SysUserMapper;
import com.alei.ssm.entity.system.SysUser;
import com.alei.ssm.service.SysUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUserServiceImpls implements SysUserService {
    @Autowired
    private SysUserMapper mapper;

    private static transient Logger logger = Logger.getLogger(SysUserServiceImpls.class);

    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public int insert(SysUser record) {
        return mapper.insert(record);
    }

    public int insertSelective(SysUser record) {
        return mapper.insertSelective(record);
    }

    public SysUser selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysUser record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysUser record) {
        return mapper.updateByPrimaryKey(record);
    }

    public SysUser loginAction(String loginName, String password) {
        return mapper.loginAction(loginName, password);
    }
}

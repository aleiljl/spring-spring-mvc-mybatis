package com.alei.ssm.controller;

import com.alei.ssm.common.BaseResult;
import com.alei.ssm.entity.system.SysUser;
import com.alei.ssm.service.SysUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * login controller
 *
 * @author admin
 * @create 2018-03-06 17:01
 **/
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private SysUserService sysUserService;

    private static transient Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping("/index")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/loginAction")
    @ResponseBody
    public BaseResult loginAction(HttpServletRequest request, String loginName, String password){
        BaseResult baseResult = new BaseResult();
        Map<String ,Object> map = new HashMap<String, Object>();
        try {
            SysUser sysUser = sysUserService.loginAction(loginName, password);
            if (sysUser != null) {
                baseResult.setSuccess(true);
                map.put("nickName", sysUser.getNickName());
                baseResult.setMap(map);
            } else {
                baseResult.setErrorCode("9998");
                baseResult.setErrorMsg("login is failure!");
            }
        }catch (Exception e){
            logger.error("登陆失败！",e);
        }
        return baseResult;
    }

}

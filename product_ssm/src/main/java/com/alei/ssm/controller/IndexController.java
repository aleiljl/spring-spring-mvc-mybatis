package com.alei.ssm.controller;

import com.alei.ssm.entity.system.SysUser;
import com.alei.ssm.service.SysUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private SysUserService sysUserService;

    private static transient Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        SysUser user = sysUserService.selectByPrimaryKey(userId);
        model.addAttribute("user", user);
        return "index";
    }

}

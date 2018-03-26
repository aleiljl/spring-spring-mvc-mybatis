package com.alei.ssm.interceptor;

import com.alei.ssm.common.ConfigUtil;
import com.alei.ssm.entity.system.SysUser;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontLoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
		SysUser m = (SysUser)request.getSession().getAttribute(ConfigUtil.ADMIN_LOGIN_USER);
		if(m != null){
			return true;
		}
		if(request.getHeader("x-requested-with") != null && request.getHeader("x-requested-with")
				.equalsIgnoreCase("XMLHttpRequest")){//ajax请求
			 response.setHeader("sessionstatus", "timeout");//
			 return false;
		}
		return false;
	}
}

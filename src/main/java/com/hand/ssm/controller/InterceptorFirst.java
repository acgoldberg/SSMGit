package com.hand.ssm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorFirst implements HandlerInterceptor{

	/*渲染视图之后被调用*/
		
	public void afterCompletion(HttpServletRequest request, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		/*String url = request.getRequestURI();
		System.out.println(url);*/
		
	}
	
	/*调用目标方法之后,但在视图渲染之前
	 * 可以对请求域中的属性或视图进行修改
	 * */

	public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		/*String url = request.getRequestURI();
		System.out.println(url);*/
		
	}

	/*
	 * 该方法在目标方法调用之前被调用
	 * 或返回true,则继续调用后续的拦截器和目标方法
	 * 若返回false,则不会调用后续的拦截器和目标方法
	 * 
	 * 可以考虑做权限控制,日志,事务等
	 * */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("preHandle");
		String url = request.getRequestURI();
		System.out.println("url="+url);
/*		if(url.indexOf("jsp")>0){
			System.out.println("url="+url);
		}*/
		//System.out.println("url="+url);
		//return false;
		//request.getSession().setAttribute("status", "login");
		return true;
	}

}

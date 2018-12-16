package com.cun.provider.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * handlerinterceptor测试
 * 拦截handler的执行，在HandlerAdapter调用handler之后，DispatcherServlet呈现视图之前调用该方法。
 * 可以通过给定的ModelAndView向视图增加其他模型对象。DispatcherServlet在包含多个拦截器的执行链中处理一个handler，
 * 并在执行链的结尾执行handler自身。使用该方法，每个拦截器都可以对操作后处理，实现按照处理链逆序执行。
 * todo：登录拦截、或是权限校验、或是防重复提交等
 * Created by LiuYuanZhe on 2018/12/16.
 */
public class HandlerInterceptorTest implements HandlerInterceptor{
    //使用slf4j只是打印日志，一个日志的接口，日志的具体目的可以自己定制。
    private final static Logger logger = LoggerFactory.getLogger(HandlerInterceptorTest.class);

//    在业务处理器处理请求之前被调用。预处理，可以进行编码、安全控制、权限校验等处理；
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object o) throws Exception {
        logger.info("preHandle");
        logger.info("request请求地址path[{}] uri[{}]", request.getServletPath(),request.getRequestURI());
        //request.getHeader(String) 从请求头中获取数据
        //从请求头中获取用户token（登陆凭证根据业务而定）
        //todo:具体业务要求

        return true;
    }

//    在业务处理器处理请求执行完成后，生成视图之前执行。
// 后处理（调用了Service并返回ModelAndView，但未进行页面渲染），有机会修改ModelAndView
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object o,
                           ModelAndView modelAndView) throws Exception {
        logger.info("postHandle");
    }

//    在DispatcherServlet完全处理完请求后被调用，可用于清理资源等。返回处理
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object o,
                                Exception e) throws Exception {
        logger.info("afterCompletion");
    }
}

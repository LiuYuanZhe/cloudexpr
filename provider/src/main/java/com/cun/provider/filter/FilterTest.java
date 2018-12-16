package com.cun.provider.filter;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by LiuYuanZhe on 2018/12/16.
 */
//@Component
public class FilterTest implements Filter {

    private static Logger logger = LoggerFactory.getLogger(FilterTest.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("dofilter");
    }

    @Override
    public void destroy() {

    }
}

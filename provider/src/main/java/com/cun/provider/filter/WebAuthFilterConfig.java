package com.cun.provider.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * Created by LiuYuanZhe on 2018/12/16.
 */
//@Configuration
public class WebAuthFilterConfig {
    @Bean
    public FilterRegistrationBean webAuthFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(webAuthFilter());
        registration.setName("FilterTest");
        registration.addUrlPatterns("/handlercontroller/*");
        registration.addInitParameter("excludeUrls", "/handlercontroller/health");
        registration.setOrder(0);
        return registration;
    }

    @Bean
    public Filter webAuthFilter() {
        return new FilterTest();
    }
}

package com.itheima;

import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;

public class WebApplicationContextUtils {

    public static ApplicationContext getWebApplicationContext(ServletContext servletContext){
        ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        return applicationContext;
    }

}



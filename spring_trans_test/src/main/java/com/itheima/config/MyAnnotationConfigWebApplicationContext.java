package com.itheima.config;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class MyAnnotationConfigWebApplicationContext extends AnnotationConfigWebApplicationContext {

    public MyAnnotationConfigWebApplicationContext(){
        super();
        this.register(SpringConfig.class);
    }

}

package com.backend.springboot.component;

import org.springframework.stereotype.Component;

@Component
public class DemoBean {
    public void demoMethod(){
        System.out.println("DemoBean method is called");
    }
}

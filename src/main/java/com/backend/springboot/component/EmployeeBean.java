package com.backend.springboot.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private final DepartmentBean departmentBean;

    @Autowired
    public EmployeeBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee works in the department: " + departmentBean.getDepartmentName());
    }
}

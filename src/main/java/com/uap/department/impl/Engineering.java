package com.uap.department.impl;

import com.uap.department.Department;

import java.util.ArrayList;
import java.util.List;

public class Engineering implements Department {

    private String engineerManager;
    private List<String> currentProjects = new ArrayList<>();
    @Override
    public boolean addManager(Integer employeeId) {
        return false;
    }

    @Override
    public boolean addEmpDept(Integer employeeId) {
        return false;
    }

    @Override
    public boolean removeEmpDept(Integer employeeId) {
        return false;
    }

    @Override
    public String deptDetails(Integer departmentId) {
        return "";
    }

   public void projectStatus(){

   }
}

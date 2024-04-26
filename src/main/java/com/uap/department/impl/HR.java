package com.uap.department.impl;

import com.uap.department.Department;

public class HR implements Department {
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

    void increaseSalary(int percentage){

    }

    void promotion(Integer employeeId){

    }
}

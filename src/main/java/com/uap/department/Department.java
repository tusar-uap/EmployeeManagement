package com.uap.department;

public interface Department {
    boolean addManager(Integer employeeId);

    boolean addEmpDept(Integer employeeId);

    boolean removeEmpDept(Integer employeeId);

    String deptDetails(Integer departmentId);
}

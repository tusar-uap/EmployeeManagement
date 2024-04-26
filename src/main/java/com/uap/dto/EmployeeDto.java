package com.uap.dto;

public class EmployeeDto {
    private Integer employeeId;
    private String name;
    private double salary;
    private String department;
    private String designation;
    private String type;

    public EmployeeDto() {
    }

    public EmployeeDto(
            Integer employeeId,
            String name,
            double salary,
            String department,
            String designation,
            String type
    ) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.designation = designation;
        this.type = type;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

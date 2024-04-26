package com.uap.dto;

public class DepartmentDto {
    private Integer departmentId;
    private String name;
    private String details;

    public DepartmentDto() {
    }

    public DepartmentDto(Integer departmentId, String name, String details) {
        this.departmentId = departmentId;
        this.name = name;
        this.details = details;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

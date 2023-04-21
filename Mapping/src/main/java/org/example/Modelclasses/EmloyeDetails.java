package org.example.Modelclasses;

import javax.persistence.*;

@Entity
public class EmloyeDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "EMPLOY_DETAIL_ID")
    private int empdetailid;
    @Column(name = "EMPLOY_DEPARTMENT")
    private String  department;
    @Column(name = "EMPLOY_CITY")
    private String city;
    private int empid;

    public EmloyeDetails( String department, String city, int empid) {
        this.department = department;
        this.city = city;
        this.empid = empid;
    }
    public  EmloyeDetails(){}

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }
}

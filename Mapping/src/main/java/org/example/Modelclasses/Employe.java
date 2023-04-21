package org.example.Modelclasses;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYE")
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMPLOYID")
    private  int empid;
    private  String EMPLOY_NAME;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMPLOYID")
    private  EmloyeDetails emloyeDetails;

    public String getEMPLOY_NAME() {
        return EMPLOY_NAME;
    }
public Employe(){}
    public Employe( String EMPLOY_NAME) {

        this.EMPLOY_NAME = EMPLOY_NAME;
    }

    public Employe(String EMPLOY_NAME, EmloyeDetails emloyeDetails) {
        this.EMPLOY_NAME = EMPLOY_NAME;
        this.emloyeDetails = emloyeDetails;
    }

    public EmloyeDetails getEmloyeDetails() {
        return emloyeDetails;
    }

    public void setEmloyeDetails(EmloyeDetails emloyeDetails) {
        this.emloyeDetails = emloyeDetails;
    }

    public void setEMPLOY_NAME(String EMPLOY_NAME) {
        this.EMPLOY_NAME = EMPLOY_NAME;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empid=" + empid +
                ", EMPLOY_NAME='" + EMPLOY_NAME + '\'' +
                ", emloyeDetails=" + emloyeDetails +
                '}';
    }
}

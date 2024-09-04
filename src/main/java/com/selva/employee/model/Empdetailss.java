package com.selva.employee.model;

import jakarta.persistence.*;

@Entity
//@Table(name="empdetails")
public class Empdetailss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empid;
    private String empname;
    private String empgender;
    private String pass;
    private long empphone;

    void Empdetails(){}



    public void Empdetails(String empgender, int empid, String empname, long empphone, String pass) {
        this.empgender = empgender;
        this.empid = empid;
        this.empname = empname;
        this.empphone = empphone;
        this.pass = pass;
    }

    public Empdetailss() {

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpgender() {
        return empgender;
    }

    public void setEmpgender(String empgender) {
        this.empgender = empgender;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public long getEmpphone() {
        return empphone;
    }

    public void setEmpphone(long empphone) {
        this.empphone = empphone;
    }
}


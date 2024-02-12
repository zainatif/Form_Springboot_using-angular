package com.example.form.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="data")
public class Data {
    @Id
    @Column(name = "data_id", length = 50)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int dataid;
    @Column(name = "data_name", length = 50)
    private String dataname;

    @Column(name = "data_city", length = 80)
    private String datacity;

    @Column(name = "data_mobile", length = 254)
    private int mobile;

    @Column(name = "Email", length = 254)
    private String email;

    public Data(int dataid, String dataname, String datacity, int mobile, String email){
        this.dataid=dataid;
        this.dataname=dataname;
        this.datacity=datacity;
        this.mobile=mobile;
        this.email=email;
    }

    public Data(String dataname, String datacity, int mobile, String email){
        this.dataname=dataname;
        this.datacity=datacity;
        this.mobile=mobile;
        this.email=email;
    }
    public Data(){

    }

    public int getDataid() {
        return dataid;
    }

    public void setDataid(int dataid) {
        this.dataid = dataid;
    }

    public String getDataname() {
        return dataname;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public String getDatacity() {
        return datacity;
    }

    public void setDatacity(String datacity) {
        this.datacity = datacity;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Data{" +
                "dataid=" + dataid +
                ", dataname='" + dataname + '\'' +
                ", datacity='" + datacity + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}
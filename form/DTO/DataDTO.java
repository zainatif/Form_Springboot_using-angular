package com.example.form.DTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class DataDTO {

    private int dataid;
    private String dataname;
    private String datacity;
    private int mobile;

    private String email;

    public DataDTO(int dataid, String dataname, String datacity, int mobile, String email){
        this.dataid=dataid;
        this.dataname=dataname;
        this.datacity=datacity;
        this.mobile=mobile;
        this.email=email;
    }

    public DataDTO() {
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
        return "DataDTO{" +
                "dataid=" + dataid +
                ", dataname='" + dataname + '\'' +
                ", datacity='" + datacity + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}

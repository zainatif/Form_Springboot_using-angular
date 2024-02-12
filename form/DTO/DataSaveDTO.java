package com.example.form.DTO;

public class DataSaveDTO {
    private String dataname;
    private String datacity;
    private int mobile;

    private String email;

    public DataSaveDTO(int dataid, String dataname, String datacity, int mobile, String email) {
        this.dataname = dataname;
        this.datacity = datacity;
        this.mobile = mobile;
        this.email=email;
    }

    public DataSaveDTO() {
    }

    public String getDataname() {
        return dataname;
    }

    public String getDatacity() {
        return datacity;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public void setDatacity(String datacity) {
        this.datacity = datacity;
    }

    public void setDataname(String dataname) {
        this.dataname = dataname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DataSaveDTO{" +
                "dataname='" + dataname + '\'' +
                ", datacity='" + datacity + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}

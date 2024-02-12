package com.example.form.DTO;

public class DataUpdateDTO {

    private int dataid;
    private String dataname;
    private String datacity;
    private int mobile;

    private String email;
    public DataUpdateDTO(int dataid, String dataname, String datacity, int mobile, String email){
        this.dataid=dataid;
        this.dataname=dataname;
        this.datacity=datacity;
        this.mobile=mobile;
        this.email=email;
    }
    public DataUpdateDTO() {
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
        return "DataUpdateDTO{" +
                "dataid=" + dataid +
                ", dataname='" + dataname + '\'' +
                ", datacity='" + datacity + '\'' +
                ", mobile=" + mobile +
                ", email='" + email + '\'' +
                '}';
    }
}

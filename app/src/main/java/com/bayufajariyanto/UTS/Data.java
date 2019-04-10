package com.bayufajariyanto.UTS;

public class Data {

    private String nama;
    private String alamat;
    private String nohp;
    private String gender;

    public Data(String nama, String nohp, String alamat, String gender) {
        this.nama = nama;
        this.nohp = nohp;
        this.alamat = alamat;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
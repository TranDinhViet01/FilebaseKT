package com.example.demofire;

public class Thuoc {
    int Hinh;
    String Ten;
    String DacTinh;
    String CongDung;
    String LieuThuoc;
    String LuuY;

    public Thuoc(int hinh, String ten, String dacTinh, String congDung, String lieuThuoc, String luuY) {
        Hinh = hinh;
        Ten = ten;
        DacTinh = dacTinh;
        CongDung = congDung;
        LieuThuoc = lieuThuoc;
        LuuY = luuY;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getDacTinh() {
        return DacTinh;
    }

    public void setDacTinh(String dacTinh) {
        DacTinh = dacTinh;
    }

    public String getCongDung() {
        return CongDung;
    }

    public void setCongDung(String congDung) {
        CongDung = congDung;
    }

    public String getLieuThuoc() {
        return LieuThuoc;
    }

    public void setLieuThuoc(String lieuThuoc) {
        LieuThuoc = lieuThuoc;
    }

    public String getLuuY() {
        return LuuY;
    }

    public void setLuuY(String luuY) {
        LuuY = luuY;
    }
}

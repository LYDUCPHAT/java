package bai2;

import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class LopHocPhan {
    public String maLHP;
    public String tenLHP;
    public String tenGV;
    public String thongtinlophoc;
    public SinhVien[] dsSv;

    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongtinlophoc, SinhVien[] dsSv) {
        this.maLHP = maLHP;
        this.tenLHP = tenLHP;
        this.tenGV = tenGV;
        this.thongtinlophoc = thongtinlophoc;
        this.dsSv = dsSv;
    }

    LopHocPhan(String string, String lt_huong_doi_tuong, String nguyen_van_a, String thu_7_tiet_46phong_a11, SinhVien sv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMaLHP() {
        return maLHP;
    }

    public void setMaLHP(String maLHP) {
        this.maLHP = maLHP;
    }

    public String getTenLHP() {
        return tenLHP;
    }

    public void setTenLHP(String tenLHP) {
        this.tenLHP = tenLHP;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }

    public String getThongtinlophoc() {
        return thongtinlophoc;
    }

    public void setThongtinlophoc(String thongtinlophoc) {
        this.thongtinlophoc = thongtinlophoc;
    }

    public SinhVien[] getDsSv() {
        return dsSv;
    }

    public void setDsSv(SinhVien[] dsSv) {
        this.dsSv = dsSv;
    }
    public int getsoluongSv(){
        return 0;
    }

    @Override
    public String toString() {
        return
               "LopHocPhan{"+
               "maLHP=" + maLHP +"\n"+ " tenLHP=" + tenLHP + "\n"+" tenGV=" + tenGV +"\n"+ " thongtinlophoc=" + thongtinlophoc +"\n"+ " dsSv=" + Arrays.toString(dsSv);
    }
    public class SinhVien {
    public  String masinhvien;
    public String hoTen;

    public SinhVien(String masinhvien, String hoTen) {
        this.masinhvien = masinhvien;
        this.hoTen = hoTen;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return 
                "\t         "+"\n     "+"ma sinh vien=" + masinhvien +" hoTen=" + hoTen +"\n";
    }
    public class main {

 
     public static void main(String[] args) {
         SinhVien[] sv = {new SinhVien("123", "nguyen van a "),
                          new SinhVien("456", "le thi b"),
                          new SinhVien("321", "luong van c")
                                    };
         LopHocPhan lhp = new LopHocPhan("123456", "LT huong doi tuong", "nguyen van a", "thu 7, tiet 4-6,phong a1.1",sv);
        System.out.println(lhp);
                

    }
    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_ChuaBaiMauCRUD.model;

/**
 *
 * @author hangnt
 */
public class GiangVien {

    // varchar  => String
    private String ma;
    // nvarchar => String 
    private String ten;
    // nvarchar => String 
    private String loai;
    // int => int(Nen - Integer) 
    private Integer tuoi;
    // int => int(Nen - Integer) 
    private Integer bac;
    // bit => boolean(Nen - Boolean) 
    private Boolean gioiTinh;

    public GiangVien() {
    }

    public GiangVien(String ma, String ten, String loai, Integer tuoi, Integer bac, Boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
        this.bac = bac;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getBac() {
        return bac;
    }

    public void setBac(Integer bac) {
        this.bac = bac;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "GiangVien{" + "ma=" + ma + ", ten=" + ten + ", loai=" + loai + ", tuoi=" + tuoi + ", bac=" + bac + ", gioiTinh=" + gioiTinh + '}';
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_LoadDuLieuCombobox;

/**
 *
 * @author hangnt
 */
public class DongVat {

    private String maDV;
    private String tenDV;
    private int canNang;
    private boolean gioiTinh;
    private String diaChi;
    private String loaiThucAn;

    public DongVat() {
    }

    public DongVat(String maDV, String tenDV, int canNang, boolean gioiTinh, String diaChi, String loaiThucAn) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.canNang = canNang;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.loaiThucAn = loaiThucAn;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getLoaiThucAn() {
        return loaiThucAn;
    }

    public void setLoaiThucAn(String loaiThucAn) {
        this.loaiThucAn = loaiThucAn;
    }

}

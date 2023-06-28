/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_OnTapSwing;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    private List<SinhVien> listSinhVien = new ArrayList<>(); // interface = new class 
//    ArrayList<SinhVien>lists = new ArrayList<>(); // Class = new Class 

    public SinhVienService() {
        listSinhVien.add(new SinhVien("PhongTT35", "Loại 1", true, "Ăn"));
        listSinhVien.add(new SinhVien("NguyenVV4", "Loại 2", true, "Ăn"));
        listSinhVien.add(new SinhVien("KhanhPG", "Loại 1", true, "Ăn"));
        listSinhVien.add(new SinhVien("HangNT169", "Loại 3", false, "Lăn"));
        listSinhVien.add(new SinhVien("TienNh21", "Loại 2", true, "Ăn"));
        listSinhVien.add(new SinhVien("DungNA29", "Loại 1", true, "Ăn"));
    }

    public List<SinhVien> getAll() {
        return listSinhVien;
    }
}

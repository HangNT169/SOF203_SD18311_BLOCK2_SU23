/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_ChuaBaiMauCRUD.service;

import B7_ChuaBaiMauCRUD.model.GiangVien;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class GiangVienService {
    // Chua tat ca cac ham them, sua, xoa,...
    // CRUD (CREATE , READ , UPDATE, DELETE)
    // INSERT INTO / SELECT / UPDATE / DELETE

    // Cac cau SELECT 
    // SELECT => NHIEU DONG 
    // => MANG (LIST HOAC ARRAY LIST)
    public List<GiangVien> getAll() {
        // CODE 
        // B1: Viet cau SQL
        String sql = """
                     SELECT ma, ten, loai, tuoi, bac, gioi_tinh
                     FROM QLGV.dbo.giang_vien;
                     """;
        // B2: Mo connection - Mo cong ket noi
        // Mo cong => dong cong 
//        try => Cac doan code  nghi ngo xay ra loi
//        catch => Cach fix loi 
//        finally => Du co loi hay khong => finally 
        // Ket noi thanh cong hay that bai => dong cong ket noi 
        // try.. with resource => Khong can phai dong cong 
        // https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%207/try-with-resources.md
        // Cu phap try..with resource
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            // B3: PreparedStatement => Gui cac cau lenh toi SQL
            // B4: Tao resultSet : Dai dien cho tap hop gia tri khi chay SQL (ban ghi)
            ResultSet rs = ps.executeQuery();
            // Voi cac cau select => excuteQuery 
            // B5: Tao kieu du lieu tra ve => 1 list
            List<GiangVien> lists = new ArrayList<>();
            // B6: Doc data tra về
            while (rs.next()) {
                // rs.next => Kiem tra dong sau con du lieu de doc hay k
                GiangVien gv = new GiangVien();
                gv.setBac(rs.getInt(5));
                gv.setGioiTinh(rs.getBoolean(6));
                gv.setLoai(rs.getString(3));
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setTuoi(rs.getInt(4));
                // add vao list
                lists.add(gv);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    // GET ONE => SELECT 
    public GiangVien getOne(String ma1) {
        // CODE 
        // B1: Viet cau SQL
        String sql = """
                     SELECT ma, ten, loai, tuoi, bac, gioi_tinh
                     FROM QLGV.dbo.giang_vien WHERE ma = ?;
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            // xet (truyen gia tri cho dau ?)
            ps.setObject(1, ma1);
//            ps.setObject(2, tuoi);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // rs.next => Kiem tra dong sau con du lieu de doc hay k
                GiangVien gv = new GiangVien();
                gv.setBac(rs.getInt(5));
                gv.setGioiTinh(rs.getBoolean(6));
                gv.setLoai(rs.getString(3));
                gv.setMa(rs.getString(1));
                gv.setTen(rs.getString(2));
                gv.setTuoi(rs.getInt(4));
                // add vao list
                return gv;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    // ADD => INSERT INTO => Boolean
    public Boolean add(GiangVien gv) {
        // B1: Tao SQL
        String sql = """
                    INSERT INTO QLGV.dbo.giang_vien
                    (ma, ten, loai, tuoi, bac, gioi_tinh)
                    VALUES(?,?,?,?,?,?);
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, gv.getMa());
            ps.setObject(2, gv.getTen());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.getGioiTinh());
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    // DELETE => DELETE => BOOLEAN
    public Boolean delete(String ma) {
        // B1: Tao SQL
        String sql = """
                    DELETE FROM QLGV.dbo.giang_vien
                    WHERE ma= ?;
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    // UPDATE => UPDATE => Boolean
    public Boolean update(GiangVien gv, String ma) {
        // B1: Tao SQL
        String sql = """
                    UPDATE QLGV.dbo.giang_vien
                    SET ma = ? , ten= ? , loai= ?, tuoi=?, bac=?, gioi_tinh=?
                    WHERE ma=?;
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, gv.getMa());
            ps.setObject(2, gv.getTen());
            ps.setObject(3, gv.getLoai());
            ps.setObject(4, gv.getTuoi());
            ps.setObject(5, gv.getBac());
            ps.setObject(6, gv.getGioiTinh());
            ps.setObject(7, ma);
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
//        List<GiangVien> lists = new GiangVienService().getAll();
//        for (GiangVien gv : lists) {
//            System.out.println(gv.toString());
//        }
//        GiangVien gv = new GiangVien("Ph12", "aaa", "aaa", 10, 10, true);
//        System.out.println(new GiangVienService().add(gv));
        System.out.println(new GiangVienService().delete("HangNT169"));
//        GiangVien gv = new GiangVienService().getOne("HangNT169");
//        System.out.println(gv.toString());
    }
}

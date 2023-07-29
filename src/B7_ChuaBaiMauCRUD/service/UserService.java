/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_ChuaBaiMauCRUD.service;

import B7_ChuaBaiMauCRUD.model.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class UserService {

    public List<Users> getAll() {
        String sql = """
                     SELECT id, username, password, email
                     FROM DEMO_2707.dbo.users;
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<Users> lists = new ArrayList<>();
            while (rs.next()) {
                Users user = new Users(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                lists.add(user);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Users searchByUsername(String username) {
        String sql = """
                     SELECT id, username, password, email
                     FROM DEMO_2707.dbo.users WHERE username = ? ;
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Users user = new Users(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getString(4));
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    // ADD => INSERT INTO => Boolean

    public Boolean add(Users user) {
        // B1: Tao SQL
        String sql = """
                   INSERT INTO DEMO_2707.dbo.users
                    (username, password, email)
                    VALUES(?,?,?);
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, user.getUsername());
            ps.setObject(2, user.getPassword());
            ps.setObject(3, user.getEmail());
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    // DELETE => DELETE => BOOLEAN
    public Boolean delete(int id) {
        // B1: Tao SQL
        String sql = """
                    DELETE FROM DEMO_2707.dbo.users
                    WHERE id = ?
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    // UPDATE => UPDATE => Boolean
    public Boolean update(Users user, int id) {
        // B1: Tao SQL
        String sql = """
                    UPDATE DEMO_2707.dbo.users
                    SET password = ?
                    WHERE id=?;
                    """;
        int check = 0;
        // Code
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, user.getPassword());
            ps.setObject(2, id);
            check = ps.executeUpdate(); // Insert, Update, Delete => Excute Update
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {
//        new UserService().getAll().forEach(s -> System.out.println(s));
//        System.out.println(new UserService().searchByUsername("hangnt169"));
        Users u = new Users("new username", "hang update passs", "name@gmail.com");
        System.out.println(new UserService().delete(5));
    }
}

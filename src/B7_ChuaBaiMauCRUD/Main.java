/*xoá
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_ChuaBaiMauCRUD;

/**
 *
 * @author hangnt
 */
public class Main {
    /**
     * => Moi thu them, sua xoa 
     * => Khi tat di bat lai => Khong luu duoc 
     * Java 2 => Luu Object vao file 
     * Len Java 3 => Luu vao CSDL
     * => Khi lưu vào CSDL hay là file 
     * => Khi tắt chương trình đi chạy lại vẫn lưu được giá trị 
     * vừa thêm sửa xoá
     * Kết noi SQL voi Java => JDBC
     * JDBC (Java Database Connect....) là 1 API 
     * giúp giao tiếp dược với CSDL
     * 1. Driver manager: Quản lý ds các driver
     * 2. Connection: La 1 interface cung cap cac method can thiet
     * de trao doi voi CSDL
     * 3. Statement
     * 4. ResultSet
     * 5.SQLExpection: Loi ngoai le lien quan toi SQL
     * ...
     */
    // package : goi nhom cac class chung nhiem vu 
    // Ten pacakge : LUON LUON VIET THUONG 
    // VD: view, domainmodel
    // pacakge
    // view  <=> service <=> repository <=> DB(SQLSERVER,MYSQL,POSTGRESS,H2..)
    // view: chua cac class hien thi giao dien(JFrame...)
    // service: chua cac class => xu ly logic cua toan project
    // repository: chua cac class TRAO DOI TRUC TIEP CSDL 
    // view <=> service
    // service: logic (merge them ca repo)
    // entity/model(domainmodel,viewmodel,entity,request,response..)
    // model: Chua cac class MAPPING VOI CSDL(ORM - OBJECT RELATIONSHIP MAPPING)        
}

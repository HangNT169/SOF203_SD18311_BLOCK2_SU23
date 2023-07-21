/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_CRUDListFixCung.service;

import B3_CRUDListFixCung.DongVat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class DongVatService {

    private List<DongVat> list = new ArrayList<>();

    public DongVatService() {
        list.add(new DongVat("Ma1", "Meo", 10, true, "Ha noi"));
        list.add(new DongVat("Ma2", "Cho", 20, false, "Ha noi"));
        list.add(new DongVat("Ma3", "Ga", 30, true, "Ha noi"));
        list.add(new DongVat("Ma4", "Cho dom", 40, false, "Ha noi"));
    }

    public List<DongVat> getAll() {
        return list;
    }

    public void addDongVat(DongVat dongVat) {
        list.add(dongVat);
    }

    public void remove(int viTri) {
        list.remove(viTri);
    }

    public void updateDongVat(int viTri, DongVat dongVat) {
        list.set(viTri, dongVat);
    }

    public void sapXep() {
        // sort doi voi String => compareTo
//        list.sort((o1, o2) -> {
//            return o1.getTenDV().compareTo(o2.getTenDV()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
//        });
        // SS so dung dau -
        list.sort((o1, o2) -> {
            return o1.getCanNang() - o2.getCanNang(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        });
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU10.Tugas;

/**
 *
 * @author PC-HP
 */
public class Keledai extends Binatang implements IHerbivora {

    private String suara;
    private String warnaBulu;

    public Keledai(String nama, String warnaBulu, String suara, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Keledai adalah Binatang Jinak");
    }

    @Override
    public void displayMakan() {
        System.out.println("dan dia Memakan Tumbuhan");
    }

    public void displayData() {
        System.out.println("Nama        : " + nama);
        System.out.println("Warna bulu  : " + warnaBulu);
        System.out.println("Suara       : " + suara);
        System.out.println("Jumlah Kaki : " + jmlKaki + "\n");
    }
}

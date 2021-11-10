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
public class Singa extends Binatang implements IKarnivora {

    private String suara;
    private String warnaBulu;

    public Singa(String nama, String warnaBulu, String suara, int jmlKaki) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Singa adalah Binatang Buas");
    }

    @Override
    public void displayMakan() {
        System.out.println("dan dia Memakan Daging");
    }

    public void displayData() {
        System.out.println("Nama        : " + nama);
        System.out.println("Warna bulu  : " + warnaBulu);
        System.out.println("Suara       : " + suara);
        System.out.println("Jumlah Kaki : " + jmlKaki + "\n");
    }
}

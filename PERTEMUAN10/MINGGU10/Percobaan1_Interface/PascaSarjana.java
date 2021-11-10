/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU10.Percobaan1_Interface;

/**
 *
 * @author PC-HP
 */
public class PascaSarjana extends Mahasiswa implements ICumlaude{

    public PascaSarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Nama saya "+super.nama);
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggi() {
         System.out.println("IPK-ku lebih dari 3,71");
    }
    
}

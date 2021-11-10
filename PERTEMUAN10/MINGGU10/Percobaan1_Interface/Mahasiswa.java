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
public class Mahasiswa {
    protected String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    public void kuliahDiKampus(){
        System.out.println("Aku Mahasiswa, namaku "+this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }
}

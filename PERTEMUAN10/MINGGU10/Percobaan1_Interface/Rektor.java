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
public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, Memberikan Sertifikat Cumlaude");
        System.out.println("Selamat! silakan perkenalkan diri Anda..");
        
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        
        System.out.println("-------------------------------------------");
    }
}

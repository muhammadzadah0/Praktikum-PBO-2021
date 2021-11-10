/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU10.Percobaan1_Interface;

import MINGGU10.Percobaan1_Interface.ICumlaude;
import MINGGU10.Percobaan1_Interface.Mahasiswa;
import MINGGU10.Percobaan1_Interface.PascaSarjana;
import MINGGU10.Percobaan1_Interface.Rektor;
import MINGGU10.Percobaan1_Interface.Sarjana;

public class interfaceMain {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();
        
//        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
//        pakRektor.beriSertifikatCumlaude(mhsBiasa);
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude(masterCumlaude);
    }
}

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
public class TugasMain {

    public static void main(String[] args) {
        Gorilla gor = new Gorilla("Rony Si Gor", "Hitam", "Hu.. Hu.. hurr", 2);
        Singa sing = new Singa("Aslan", "Putih", "Argghhhh ", 4);
        Keledai kel = new Keledai("Bunny", "Abu-Abu ke hitaman", "Aighh Aighh", 4);

        gor.displayBinatang();
        gor.displayMakan();
        gor.displayData();

        sing.displayBinatang();
        sing.displayMakan();
        sing.displayData();

        kel.displayBinatang();
        kel.displayMakan();
        kel.displayData();

    }
}

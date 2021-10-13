/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MINGGU6.Tugas;

public class DaftarGaji {

    public Pegawai listPegawai[];
    public int noPegawai;

    DaftarGaji(int no) {
        this.listPegawai = new Pegawai[no];

    }

    public void addPegawai(Pegawai pgw) {
        listPegawai[noPegawai] = pgw;
        noPegawai++;
    }

    public int getNoPegawai() {
        return noPegawai;
    }

    public void setNoPegawai(int noPegawai) {
        this.noPegawai = noPegawai;
    }

    public void printSemuaGaji() {
        for (int a = 0; a < noPegawai; a++) {
            System.out.println("Nama    : " + listPegawai[a].nama);
            System.out.println("NIP     : " + listPegawai[a].nip);
            System.out.println("Alamat  : " + listPegawai[a].alamat);
            System.out.println("Gaji    : " +listPegawai[a].getGaji());
            System.out.println();
        }
    }
}

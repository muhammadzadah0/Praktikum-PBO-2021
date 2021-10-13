package MINGGU6.Tugas;

public class Pegawai {

    public String nip;
    public String nama;
    public String alamat;

    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        int gaji = 3500000;
        return gaji;
    }
}

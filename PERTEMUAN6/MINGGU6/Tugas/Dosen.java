package MINGGU6.Tugas;

public class Dosen extends Pegawai {

    private int jumlahSKS;
    private int tarifSks;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        int gaji = jumlahSKS * 3500000;

        return gaji;
    }
}

package MINGGU3.Tugas;

public class Anggota {

    private String nomorKtp;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    private String nama;

    Anggota(String noKtp, String nama, int limitPeminjaman) {
        this.nomorKtp = noKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public void pinjam(int newPinjam) {
        if (jumlahPinjaman + newPinjam <= limitPeminjaman) {
            jumlahPinjaman += newPinjam;
        } else {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit!!!");
        }
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void angsur(int newAngsur) {
        if (newAngsur > (0.1 * jumlahPinjaman)) {
            jumlahPinjaman -= newAngsur;
        } else {
            System.out.println("“Maaf,angsuran harus 10% dari jumlah pinjaman");
        }

    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

    public String getNama() {
        return nama;
    }
}

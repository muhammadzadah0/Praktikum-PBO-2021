package MINGGU3.Tugas;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner zdh = new Scanner(System.in);
        Anggota zadah = new Anggota("2041720028", "Zadah", 5000000);

        System.out.println("Nama Anggota    : " + zadah.getNama());
        System.out.println("Limit Pinjaman  : " + zadah.getLimitPinjaman());

        System.out.print("\nMasukkan Jumlah Pinjaman: ");
        int jmlhPinjaman = zdh.nextInt();
        zadah.pinjam(jmlhPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + zadah.getJumlahPinjaman());

        System.out.print("\nMasukkan Jumlah Angsuran: ");
        int jmlhAngsuran = zdh.nextInt();
        zadah.angsur(jmlhAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + zadah.getJumlahPinjaman());

        System.out.print("\nMasukkan Jumlah Angsuran: ");
        jmlhAngsuran = zdh.nextInt();
        zadah.angsur(jmlhAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + zadah.getJumlahPinjaman());

    }
}

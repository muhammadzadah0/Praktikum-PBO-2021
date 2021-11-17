package MINIGGU11.Percobaan4;

public class Tester4 {

    public static void main(String[] args) {
        Owner ow = new Owner();
        TagihanListriik tL = new TagihanListriik(5, "R-1");
        ow.pay(tL);//pembayaran tagihan listrik
        System.out.println("----------------------------");

        PegawaiTetap pTtp = new PegawaiTetap("Zadah", 500);
        ow.pay(pTtp);//pembayaran untuk PegawaiTetap
        System.out.println("----------------------------");

        PegawaiMagang pMgg = new PegawaiMagang("Rony", 5);
        ow.showPegawaiSaya(pTtp);//meenampilkan informasi pegawai tetap
        System.out.println("---------------------------");
        ow.showPegawaiSaya(pMgg);//menampilkan informasi pegawai magang
    }

}

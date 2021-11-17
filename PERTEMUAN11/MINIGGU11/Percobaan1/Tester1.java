package MINIGGU11.Percobaan1;

public class Tester1 {

    public static void main(String[] args) {
        PegawaiTetap pTtp = new PegawaiTetap("Rony", 500);
        PegawaiMagang pMgg = new PegawaiMagang("Zadah", 5);
        TagihanListriik tL = new TagihanListriik(5, "A-1");

        Employee e;
        Payable p;
        e = pTtp;
        e = pMgg;
        p = pTtp;
        p = tL;
       
    }

}

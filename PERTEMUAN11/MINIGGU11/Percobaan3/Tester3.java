package MINIGGU11.Percobaan3;

public class Tester3 {

    public static void main(String[] args) {
        PegawaiTetap pTtp = new PegawaiTetap("Rony", 500);
        PegawaiMagang pMgg = new PegawaiMagang("Zadah", 5);
        TagihanListriik tL = new TagihanListriik(5, "A-1");

        Employee e[] = {pTtp, pMgg};
        Payable p[] = {pTtp, tL};
        Employee e2[] = {pTtp, pMgg, tL};

    }

}

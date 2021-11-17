package MINIGGU11.Percobaan4;

public class Owner {

    public void pay(Payable p) {
        System.out.println("Total Payment = " + p.getPaymentAmount());
        if (p instanceof TagihanListriik) {
            TagihanListriik tL = (TagihanListriik) p;
            System.out.println("" + tL.getTagihanInfo());
        } else if (p instanceof PegawaiTetap) {
            PegawaiTetap pTtp = (PegawaiTetap) p;
            pTtp.getEmployeeInfo();
            System.out.println("" + pTtp.getEmployeeInfo());
        }
    }

    public void showPegawaiSaya(Employee e) {
        System.out.println("" + e.getEmployeeInfo());
        if (e instanceof PegawaiTetap) {
            System.out.println("Anda harus membayarnya setiap bulan");
        } else {
            System.out.println("Anda tidak perlu membayarnya");
        }
    }
}

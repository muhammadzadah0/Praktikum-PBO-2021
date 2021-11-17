package MINIGGU11.Percobaan2;

public class Tester2 {

    public static void main(String[] args) {
        PegawaiTetap pTtp = new PegawaiTetap("zadah", 500);
        Employee e;
        e = pTtp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("------------------");
        System.out.println(""+pTtp.getEmployeeInfo());
    }

}

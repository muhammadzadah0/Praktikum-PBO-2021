package MINIGGU11.Percobaan3;

public class PegawaiTetap extends Employee implements Payable {

    private int gaji;

    public PegawaiTetap(String name, int gaji) {
        this.name = name;
        this.gaji = gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    @Override
    public int getPaymentAmount() {
        return (int) (gaji + 0.05 * gaji);
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Terdaftar sebagai karyawan tetap dengan gaji " + gaji + "\n";
        return info;
    }

}

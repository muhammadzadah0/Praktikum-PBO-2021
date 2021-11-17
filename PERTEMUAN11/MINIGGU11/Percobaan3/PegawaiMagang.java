package MINIGGU11.Percobaan3;

public class PegawaiMagang extends Employee {

    private int length;

    public PegawaiMagang(String name, int length) {
        super.name = name;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Register as intership employee for " + length + " month/s\n";
        return info;
    }

}

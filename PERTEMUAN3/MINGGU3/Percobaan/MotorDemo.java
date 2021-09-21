package MINGGU3.Percobaan;

public class MotorDemo {

    public static void main(String[] args) {
        MotorEn mtr = new MotorEn();
        mtr.printStatus();
        mtr.tambahKecepatan();

        mtr.nyalahkanMesin();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.tambahKecepatan();
        mtr.printStatus();

        mtr.matikanMesin();
        mtr.printStatus();

    }

}

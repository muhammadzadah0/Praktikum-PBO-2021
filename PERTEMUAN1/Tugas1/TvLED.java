package Tugas1;

public class TvLED extends Tv {

    private String model;

    public void modelTv(String mTv) {
        model = mTv;
    }

    public void cetakModel() {
        super.tampilanTv();
        System.out.println("Support System: " + model);
    }
}

package Tugas1;

public class Keyboard {

    private String merek;
    private String keys;
    private String keysSwitch;
    private String rbg;

    public void namaMerek(String merekKeyboard) {
        merek = merekKeyboard;

    }

    public void jumlahKeys(String jmlKey) {
        keys = jmlKey;
    }

    public void warnaSwitch(String wrnSwitch) {
        keysSwitch = wrnSwitch;
    }

    public void setRgb(String rgbSet) {
        rbg = rgbSet;
    }

    public void tampilKeyboard() {
        System.out.println("Merek: " + merek);
        System.out.println("Jumlah Keys: " + keys);
        System.out.println("Warna Switch: " + keysSwitch);
        System.out.println("Warna RGB: " + rbg);
    }
}

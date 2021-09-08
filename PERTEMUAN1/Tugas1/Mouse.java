package Tugas1;

public class Mouse {

    private String merek;
    private String warna;
    private String dpi;

    public void namaMerek(String merekMouse) {
        merek = merekMouse;
    }

    public void warnaMouse(String mouseWarna) {
        warna = mouseWarna;
    }

    public void setDpi(String dpiSet) {
        dpi = dpiSet;
    }

    public void tampilMouse() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("DPI: " + dpi);
    }
}

package Tugas1;

public class TvMain {

    public static void main(String[] args) {
        Tv tv1 = new Tv();
        TvTabung tv2 = new TvTabung();
        TvLED tv3 = new TvLED();
        Keyboard k = new Keyboard();
        Mouse m = new Mouse();

        tv1.namaMerek("Polytron");
        tv1.ukuranLayar(15);
        tv1.channel(1);
        tv1.tambahSuara(10);
        tv1.tampilanTv();
        System.out.println("");

        tv2.namaMerek("Sharp");
        tv2.ukuranLayar(20);
        tv2.channel(2);
        tv2.tambahSuara(10);
        tv2.modelTv("Tv Tabung Analog");
        tv2.cetakModel();
        System.out.println("");

        tv3.namaMerek("");
        tv3.ukuranLayar(32);
        tv3.channel(3);
        tv3.tambahSuara(15);
        tv3.modelTv("Tv LED Digital SmartTV");
        tv3.cetakModel();
        System.out.println("");
        
        k.namaMerek("Imperion Mach");
        k.jumlahKeys("87");
        k.warnaSwitch("Merah");
        k.setRgb("Hijau");
        k.tampilKeyboard();
        System.out.println("");
        
        m.namaMerek("HP Pavilion Gaming Mouse 300");
        m.warnaMouse("Hitam");
        m.setDpi("800");
        m.tampilMouse();
        System.out.println("");
    }
}

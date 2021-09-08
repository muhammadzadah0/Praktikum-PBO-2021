package Tugas1;

public class Tv {

    private String merek;
    private int ukLayar;
    private int channel;
    private int suara;

    public void namaMerek(String merekTv) {
        merek = merekTv;
    }

    public void ukuranLayar(int layar) {
        ukLayar = layar;
    }

    public void channel(int channelTv) {
        channel = channelTv;
    }

    public void tambahSuara(int suaraKencang) {
        suara += suaraKencang;

    }

    public void kurangSuara(int suaraPelan) {
        suara -= suaraPelan;

    }

    public void tampilanTv() {
        System.out.println("Merek: " + merek);
        System.out.println("Ukuran Layar: " + ukLayar + "inc");
        System.out.println("Channel: " + channel);
        System.out.println("Suara: " + suara + "%");

    }

}

package MINGGU4.Percobaan2;

public class Mobil {

    private String merk;
    private int biaya;

    Mobil() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobil(int hari){
    return biaya * hari;
    }
    
}

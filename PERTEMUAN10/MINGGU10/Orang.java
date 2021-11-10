package MINGGU10;

public class Orang {
    private String nama;
    private Hewan hewanPeliharaan;

    public Orang(String nama) {
        this.nama = nama;
    }
    
    public void peliharaanHewan(Hewan hewanPeliharaan){
    this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalan(){
        System.out.println("Namaku "+ this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara: "); 
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
               
    }
    
}

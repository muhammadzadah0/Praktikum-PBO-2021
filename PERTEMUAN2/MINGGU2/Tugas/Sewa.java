package MINGGU2.Tugas;

public class Sewa {

    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void tampilDataSewa() {
        System.out.println("ID Member   : " + id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Nama Game   : " + namaGame);
        System.out.println("Harga       : " + harga);
    }

    public int lamaSewa(int lamaSewa) {
        int totalBayar = lamaSewa * harga;
        return totalBayar;
        
    }
   
}

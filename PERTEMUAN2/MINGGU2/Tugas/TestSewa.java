
package MINGGU2.Tugas;

public class TestSewa {
     public static void main(String[] args) {
       Sewa zad = new Sewa();
        System.out.println("==============================\n"
                + "        SEWA VIDEO GAME       \n"
                + "==============================\n");
      
        
        zad.id = 290502;
        zad.namaMember = "Zadah";
        zad.namaGame = "GTA V";
        zad.harga = 50000;
        zad.tampilDataSewa();
        
         System.out.println("Harga sewa  : "+zad.lamaSewa(3));
    }
}

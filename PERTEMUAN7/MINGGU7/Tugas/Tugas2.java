package MINGGU7.Tugas;

public class Tugas2 {

    public static void main(String[] args) {
        Manusia a = new Manusia();
        Dosen b = new Dosen();
        Mahasiswa c = new Mahasiswa();
        
        a.bernafas();
        a.makan();
        System.out.println("");
        
        b.bernafas();
        b.makan();
        b.lembur();
        System.out.println("");
        
        c.bernafas();
        c.makan();
        c.tidur();
    }

}

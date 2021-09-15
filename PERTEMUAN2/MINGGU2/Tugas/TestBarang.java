package MINGGU2.Tugas;

public class TestBarang {

    public static void main(String[] args) {
        Barang br = new Barang();
        System.out.println("=======================================\n"
                         + "         L A P T O P  K I T E          \n"
                         + "=======================================\n");

        br.kode = "ec10077ax";
        br.namaBarang = "Laptop HP Pavilion 15";
        br.hargaDasar = 20000000;
        br.diskon = 0.25f;
        br.tampilData();
    }

}

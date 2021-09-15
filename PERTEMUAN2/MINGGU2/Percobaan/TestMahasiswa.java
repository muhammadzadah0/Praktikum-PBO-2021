package MINGGU2.Percobaan;

public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        
        System.out.println("");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 102;
        mhs2.nama = "Zadah";
        mhs2.alamat = "Jl. Perusahaan No 25";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();
                        
    }
}

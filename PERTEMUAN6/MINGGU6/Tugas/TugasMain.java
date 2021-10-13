package MINGGU6.Tugas;

public class TugasMain {
    public static void main(String[] args) {
        DaftarGaji p = new DaftarGaji(10);
        Dosen d = new Dosen("1234567"," Septian Enggar Sukmana, S.Pd., M.T.","Malang");
        d.setSKS(2);
        
        Pegawai pgw = new Pegawai("2041720028","Muhammad Hamamiy Zadah","Malang");
        pgw.getGaji();
        
        p.addPegawai(d);
        p.addPegawai(pgw);
        p.printSemuaGaji();
    }
}

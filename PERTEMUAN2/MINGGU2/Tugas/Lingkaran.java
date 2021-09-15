
package MINGGU2.Tugas;

public class Lingkaran {
    public double phi;
    public double r;
    

    public void hitungLuas() {
        phi = 3.14;
        double L = phi * r * r;
        System.out.println("Luas Lingkaran : " + L);
    }

    public void hitungKeliling() {
        phi = 3.14;
        double K = 2 * phi * r;
        System.out.println("Keliling Lingkaran : " + K);
    }
}

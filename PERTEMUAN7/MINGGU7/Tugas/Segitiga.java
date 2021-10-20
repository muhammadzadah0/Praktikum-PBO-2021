package MINGGU7.Tugas;

public class Segitiga {

    private int sudut;

    public void setSudut(int sudut) {
        this.sudut = sudut;
    }

    public int totalSudut(int sudutA) {
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        double c = Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
        return c;
    }

    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        System.out.println("totalSudut: " + sgt.totalSudut(90));
        System.out.println("totalSudut: " + sgt.totalSudut(60, 90));
        System.out.println("Sisi C : "  +   sgt.keliling(3, 4));
        System.out.println("Keliling: " +   sgt.keliling(4, 6, 8));

    }
}

package MINGGU3.Tugas;

public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.err.println("Age  : " + encap.getAge());
    }
}

package MINGGU12.frontend;

import MINGGU12.Backend.*;

public class TestBackend {

    public static void main(String[] args) {
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//
//        Anggota ang1 = new Anggota("Zadah", "Malang", "11111111");
//        Anggota ang2 = new Anggota("Rony", "Malang", "222222");
//        Anggota ang3 = new Anggota("Yanu", "Malang", "333333");
//
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
//
//        ang1.save();
//        ang2.save();
//        ang3.save();
//
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//
//        ang1.setAlamat("Singosari, Malang");
//        ang1.save();
//
//        // test delete
//        kat3.delete();
//        ang2.delete();
//
//        // test select all
//        for (Kategori k : new Kategori().getAll()) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//
//        for (Anggota a : new Anggota().getAll()) {
//            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat() + ", telepon: " + a.getTelepon());
//        }
//        // test search
//        for (Kategori k : new Kategori().search("ilmiah")) {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        }
//        for (Anggota a : new Anggota().search("yanu")) {
//            System.out.println("Nama: " + a.getNama() + ", alamat: " + a.getAlamat() + ", telepon: " + a.getTelepon());
//
//        }

        Kategori novel = new Kategori().getById(45);
        Kategori referensi = new Kategori().getById(46);

        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");

        // test insert
        buku1.save();
        buku2.save();

        // test update
        buku2.setJudul("Aljabar Linier");
        buku2.save();

        // test delete
        buku3.delete();

        // test select all
        for (Buku b : new Buku().getAll()) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }

        // test search
        for (Buku b : new Buku().search("timun")) {
            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
        }
    }

}

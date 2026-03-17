/*
 * Nama File : MBangunDatar.java
 * Deskripsi : Main class untuk melakukan pengujian atribut dan method yang ada
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
 */

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Persegi Persegi2 = new Persegi(4, "merah", "putih");
        Lingkaran Lingkaran1 = new Lingkaran(14, "ungu", "hitam");
        Lingkaran Lingkaran2 = new Lingkaran(21, "kuning", "hijau");

        System.out.println("PERSEGI1");
        Persegi1.printInfo();

        System.out.println("\nPERSEGI2");
        Persegi2.printInfo();

        System.out.println("\nLINGKARAN1");
        Lingkaran1.printInfo();

        System.out.println("\nLINGKARAN2");
        Lingkaran2.printInfo();

        System.out.println("\nApakah luas persegi1 sama dengan luas persegi2? " + Persegi1.isEqualLuas(Persegi2));
        System.out.println("Apakah keliling ligkaran1 sama dengan keliling lingkaran2? " + Lingkaran1.isEqualKeliling(Lingkaran2));

        System.out.println("\nPanjang sisi awal persegi1: " + Persegi1.getSisi());
        Persegi1.zoomIn();
        System.out.println("Panjang sisi setelah zoomIn: " + Persegi1.getSisi());
        Persegi1.zoomOut();
        System.out.println("Panjang sisi setelah zoomOut: " + Persegi1.getSisi());
        Persegi1.zoom(50);
        System.out.println("Panjang sisi setelah zoom dengan skala 50%: " + Persegi1.getSisi());

        System.out.println("\nPanjang jari awal lingkaran1: " + Lingkaran1.getJari());
        Lingkaran1.zoomIn();
        System.out.println("Panjang jari setelah zoomIn: " + Lingkaran1.getJari());
        Lingkaran1.zoomOut();
        System.out.println("Panjang jari setelah zoomOut: " + Lingkaran1.getJari());
        Lingkaran1.zoom(75);
        System.out.println("Panjang jari setelah zoom dengan skala 75%: " + Lingkaran1.getJari());
    }
}
/*
 * Nama File : MBangunDatar.java
 * Deskripsi : Main class untuk melakukan pengujian atribut dan method yang ada
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
 */

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");

        System.out.println("PERSEGI");
        Persegi1.printInfo();

        System.out.println("\nLINGKARAN");
        Lingkaran1.printInfo();

        System.out.println("\nKeliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());

        System.out.println("\nKeliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());
    }
}
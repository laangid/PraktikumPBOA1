/*
 * Nama File : MAnabul.java
 * Deskripsi : Main class untuk menguji relasi antar objek dengan objek class lainnya
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
 */

public class MAnabul {
    public static void main(String[] args) {
        Anabul K = new Kucing("simba");
        Anabul A = new Anjing("rocky");
        Anabul B = new Burung("abby");

        System.out.println("Kucing bergerak: " + K.gerak());
        System.out.println("Kucing bersuara: " + K.bersuara());

        System.out.println("Anjing bergerak: " + A.gerak());
        System.out.println("Anjing bersuara: " + A.bersuara());

        System.out.println("Burung bergerak: " + B.gerak());
        System.out.println("Burung bersuara: " + B.bersuara());        
    }
}
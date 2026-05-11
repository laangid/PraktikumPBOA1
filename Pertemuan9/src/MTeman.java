/*
 * Nama File : MTeman.java
 * Deskripsi : Main class untuk melakukan pengujian atribut dan method yang ada
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 4 Mei 2026
 */

public class MTeman {
    public static void main (String[] args){

        // Object Teman
        Teman T = new Teman();
 
        // getNbelm
        System.out.println("\nJumlah teman awal: " + T.getNbelm());
 
        // addNama
        T.addNama("Indigo");
        T.addNama("Mina");
        T.addNama("Rafa");
        T.addNama("Zara");
        T.addNama("Budi");
        System.out.println("\nTotal teman sekarang: \n" + T.getNbelm());
 
        // showTeman
        T.showTeman();
 
        // getNama
        System.out.println("\nTeman ke-0: " + T.getNama(0));
        System.out.println("Teman ke-2: " + T.getNama(2));
 
        // setNama
        System.out.println("\nSebelum: " + T.getNama(1));
        T.setNama(1, "Utami");
        System.out.println("Sesudah: " + T.getNama(1));
 
        // isMember
        System.out.println("\nApakah 'Rafa' adalah teman? " + T.isMember("Rafa"));
        System.out.println("Apakah 'Joko' adalah teman? " + T.isMember("Joko"));
 
        // gantiNama
        System.out.println("\n-- Daftar sebelum gantiNama --");
        T.showTeman();
        T.gantiNama("Zara", "Sarah");
        System.out.println("-- Daftar sesudah gantiNama --");
        T.showTeman();
 
        // countNama
        System.out.println("\nBerapa kali 'Budi' muncul? " + T.countNama("Budi"));
        System.out.println("Berapa kali 'Joko' muncul? " + T.countNama("Joko"));
 
        // delNama
        System.out.println("\n-- Daftar sebelum delNama--");
        T.showTeman();
        T.delNama("Budi");
        System.out.println("-- Daftar sesudah delNama --");
        T.showTeman();
        System.out.println("\nJumlah teman sekarang: " + T.getNbelm());

    }
}

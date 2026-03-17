/*
 * Nama File : MManusia.java
 * Deskripsi : Main class untuk melakukan pengujian atribut dan method yang ada
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
 */

import java.time.LocalDate;

public class MManusia{
    public static void main (String[] args) {
        PNS PNS1 = new PNS(
            "Satriyo", 
            LocalDate.of(2006,4,1), 
            "Jl. Seroja", 
            15000000, 
            "198302032006041002"
        );

        Pengusaha Pengusaha1 = new Pengusaha(
            "Adhy",
            LocalDate.of(2000,1,1),
            "Jl.Air",
            55000000,
            "000-556-773-212-000-5"
        );
        
        Petani Petani1 = new Petani(
            "Nugraha",
            LocalDate.of(1977,1,9),
            "Jl. Bunga 9 Tembalang",
            5000000,
            "wonogiri"
        );

        PNS PNS2 = new PNS(
            "Panji",
            LocalDate.of(2010,4,1),
            "Jl. Panorama 112 Tembalang",
            10000000,
            "198004212010041002"
        );

        PNS2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns()); 
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS()); 
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha()); 
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak PNS1 = " + PNS1.hitungPajak()); 
        System.out.println("Pajak Pengusaha1 = " + Pengusaha1.hitungPajak()); 
        System.out.println("Pajak Petani1 = " + Petani1.hitungPajak());
        System.out.println("Pajak PNS2 = " + PNS2.hitungPajak());

        System.out.println("\nMasa Kerja PNS1 = " + PNS1.hitungMasaKerja()); 
        System.out.println("Masa Kerja Pengusaha1 = " + Pengusaha1.hitungMasaKerja()); 
        System.out.println("Masa Kerja Petani1 = " + Petani1.hitungMasaKerja());
        System.out.println("Masa Kerja PNS2 = " + PNS2.hitungMasaKerja()); 

        System.out.println("\n(DETAIL PNS1)");
        PNS1.cetakInfo();
        System.out.println("\n(DETAIL PENGUSAHA1)"); 
        Pengusaha1.cetakInfo();
        System.out.println("\n(DETAIL PETANI1)"); 
        Petani1.cetakInfo();
        System.out.println("\n(DETAIL PNS2)");
        PNS2.cetakInfo();
    }
}
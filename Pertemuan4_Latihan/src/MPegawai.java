/*
 * Nama File : MPegawai.java
 * Deskripsi : Program utama untuk menguji class Pegawai
 * Pembuat   : Elang Fadila Ahmad
 */

import java.time.LocalDate;

public class MPegawai {

    public static void main(String[] args) {

        Pegawai dosenTetap = new DosenTetap(
            "78647324",                      
            "Fakultas Sains dan Matematika",
            "9545647548",                    
            "Andi",
            LocalDate.of(1990,5,5),           
            LocalDate.of(2015,1,1),          
            5000000                           
        );

        Pegawai dosenTamu = new DosenTamu(
            "98765432",                      
            LocalDate.of(2026,12,31),         
            "Fakultas Teknik",
            "1234567890",
            "Budi",
            LocalDate.of(1985,3,12),
            LocalDate.of(2022,9,1),
            4500000
        );

        Pegawai tendik = new Tendik(
            "Akademik",
            "1122334455",
            "Siti",
            LocalDate.of(1992,7,18),
            LocalDate.of(2018,4,1),
            3500000
        );

        System.out.println("(DATA DOSEN TETAP)");
        dosenTetap.printInfo();

        System.out.println("\n(DATA DOSEN TAMU)");
        dosenTamu.printInfo();

        System.out.println("\n(DATA TENDIK)");
        tendik.printInfo();
    }
}
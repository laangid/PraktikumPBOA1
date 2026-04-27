/*
 * Nama File : MMahasiswa.java
 * Deskripsi : Main class untuk menguji relasi antar objek dengan objek class lainnya
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa("M001", "Arsa", "Kimia");
        System.out.println("NIM M1 = " + M1.getNim());
        System.out.println("Nama M1 = " + M1.getNama());
        System.out.println("Program Studi M1 = " + M1.getProgramStudi());
        
        M1.setNim("M002");
        M1.setNama("Akasa");
        M1.setProgramStudi("Informatika");

        System.out.println("\n---- Setelah diubah menggunakan set ----");
        M1.printMhs();

        System.out.println("\n---- Uji variasi setProgramStudi ----");
        Mahasiswa M2 = new Mahasiswa("M003", "Sasa", "Statistika");
        M2.setProgramStudi("Matematika");
        System.out.println("Program Studi M2 (parameter string) = " + M2.getProgramStudi());
        M2.setProgramStudi();
        System.out.println("Program Studi M2 (parameter kosong) = " + M2.getProgramStudi());
        M2.setProgramStudi(M1);
        System.out.println("Program Studi M2 (parameter objek mahasiswa) = " + M2.getProgramStudi());

        System.out.println("\n---- Uji variasi konstruktor ----");
        System.out.println("-- tanpa parameter --");
        Mahasiswa M3 = new Mahasiswa();
        M3.printMhs();
        System.out.println("-- dgn parameter lengkap --");
        Mahasiswa M4 = new Mahasiswa("M006", "Rifan", "Bioteknologi");
        M4.printMhs();
        System.out.println("-- dgn parameter objek mahasiswa --");
        Mahasiswa M5 = new Mahasiswa(M4);
        M5.printMhs();
    }
}
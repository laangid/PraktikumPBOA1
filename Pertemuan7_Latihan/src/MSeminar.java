/*
 * Nama File : MSeminar.java
 * Deskripsi : Main class untuk menguji relasi antar objek dengan objek class lainnya
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
 */

public class MSeminar {
    public static void main(String[] args) {
        // 2 objek Dosen
        Dosen D1 = new Dosen("Budi Santoso", "NIP001");
        Dosen D2 = new Dosen("Siti Rahayu", "NIP002");

        // 5 objek Mahasiswa
        Mahasiswa M1 = new Mahasiswa("Arsa", "NIM001");
        Mahasiswa M2 = new Mahasiswa("Akasa", "NIM002");
        Mahasiswa M3 = new Mahasiswa("Sasa", "NIM003");
        Mahasiswa M4 = new Mahasiswa("Rifan", "NIM004");
        Mahasiswa M5 = new Mahasiswa("Dina", "NIM005");

        // dosen wali untuk setiap mahasiswa
        M1.setWali(D1);
        M2.setWali(D1);
        M3.setWali(D2);
        M4.setWali(D2);
        M5.setWali(D1);

        // objek Seminar
        Seminar seminar = new Seminar();

        // Registrasi peserta
        seminar.registrasi(D1);
        seminar.registrasi(D2);
        seminar.registrasi(M1);
        seminar.registrasi(M2);
        seminar.registrasi(M3);
        seminar.registrasi(M4);
        seminar.registrasi(M5);

        // jumlah peserta
        System.out.println("Jumlah peserta: " + seminar.countPeserta());

        // daftar peserta
        System.out.println("\n---- Daftar Peserta ----");
        seminar.tampilPeserta();

        // jumlah peserta mahasiswa
        System.out.println("\nJumlah peserta mahasiswa: " + seminar.countMahasiswa());

        // data mahasiswa
        System.out.println("\n---- Data Mahasiswa ----");
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();
    }
}
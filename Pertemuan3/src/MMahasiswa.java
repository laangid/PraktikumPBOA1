/*
 * Nama File : MMahasiswa.java
 * Deskripsi : Main class untuk menguji relasi antar objek dengan objek class lainnya
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 2 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Onjek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("M001", "Agus", "Informatika");
        Dosen D1 = new Dosen("D001", "Arif", "Informatika");
        Kendaraan K1 = new Kendaraan("H 1010 H", "motor");
        M1.setDosWal(D1);
        M1.setKendaraan(K1);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.printDetailMhs();
        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatKul());
        System.out.println("\nJumlah SKS Mata Kuliah = " + M1.getJumlahSKS());        
    }
}
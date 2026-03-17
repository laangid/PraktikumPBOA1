/*
 * Nama File : Manusia.java
 * Deskripsi : Berisi atribut dan method dalam class Manusia
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;

public abstract class Manusia {
    /* ATRIBUT */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Manusia() {

    }

    // Konstruktor untuk membuat Manusia beserta isi atributnya
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengeset nama dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    } 

    // Mengembalikan atribut tgl_mulai_kerja
    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }

    // Mengeset tgl_mulai_kerja dengan nilai baru
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mengembalikan atribut alamat
    public String getAlamat() {
        return this.alamat;
    }

    // Mengeset alamat dengan nilai baru
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Mengembalikan atribut pendapatan
    public double getPendapatan() {
        return this.pendapatan;
    }

    // Mengeset pendapatan dengan nilai baru
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    // Abstrac method untuk mengenbalikan lama masa kerja
    public abstract int hitungMasaKerja();

    // Mencetak detail manusia
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal mulai bekerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
        System.out.println("Masa kerja: " + hitungMasaKerja());
    }

    // Mengeluarkan jumlah Manusia
    public static int getCounterMns() {
        return counterMns;
    }
}

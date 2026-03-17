/*
 * Nama File : Pengusaha.java
 * Deskripsi : Berisi atribut dan method dalam class Pengusaha
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    /* ATRIBUT */
    private String npwp;
    private static final int B = 0;
    private static int counterPengusaha = 0;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Pengusaha() {

    }

    // Konstruktor untuk membuat Pengusaha beserta isi atributnya
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Mengembalikan atribut npwp
    public String getNpwp() {
        return this.npwp;
    }

    // Mengeset npwp dengan nilai baru
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    } 

    @Override
    // Abstrac method untuk mengenbalikan lama masa kerja
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masa = Period.between(getTglMulaiKerja(), sekarang);

        return masa.getYears() + B;
    }

    @Override
    // Mengeluarkan total pajak yang harus dibayarkan
    public double hitungPajak() {
        return getPendapatan() * 0.15;
    }

    @Override
    // Mencetak detail Pengusaha
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + npwp);
    }

    // Mengeluarkan jumlah Pengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
}

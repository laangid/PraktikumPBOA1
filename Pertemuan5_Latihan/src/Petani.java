/*
 * Nama File : Petani.java
 * Deskripsi : Berisi atribut dan method dalam class Petani
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    /* ATRIBUT */
    private String asal_kota;
    private static final int C = 1;
    private static int counterPetani = 0;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Petani() {

    }

    // Konstruktor untuk membuat Petani beserta isi atributnya
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Mengembalikan atribut asal_kota
    public String getAsalKota() {
        return this.asal_kota;
    }

    // Mengeset asal_kota dengan nilai baru
    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    } 

    @Override
    // Abstrac method untuk mengenbalikan lama masa kerja
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masa = Period.between(getTglMulaiKerja(), sekarang);

        return masa.getYears() + C;
    }

    @Override
    // Mengeluarkan total pajak yang harus dibayarkan
    public double hitungPajak() {
        return 0;
    }

    @Override
    // Mencetak detail Petani
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal kota: " + asal_kota);
    }

    // Mengeluarkan jumlah Petani
    public static int getCounterPetani() {
        return counterPetani;
    }
}

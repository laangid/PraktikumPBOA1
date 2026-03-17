/*
 * Nama File : PNS.java
 * Deskripsi : Berisi atribut dan method dalam class PNS
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    /* ATRIBUT */
    private String nip;
    private static final int A = 8;
    private static int counterPNS = 0;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public PNS() {

    }

    // Konstruktor untuk membuat PNS beserta isi atributnya
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // Mengembalikan atribut nip
    public String getNip() {
        return this.nip;
    }

    // Mengeset nip dengan nilai baru
    public void setNip(String nip) {
        this.nip = nip;
    } 

    @Override
    // Abstrac method untuk mengenbalikan lama masa kerja
    public int hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masa = Period.between(getTglMulaiKerja(), sekarang);

        return masa.getYears() + A;
    }

    @Override
    // Mengeluarkan total pajak yang harus dibayarkan
    public double hitungPajak() {
        return getPendapatan() * 0.1;
    }

    @Override
    // Mencetak detail PNS
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }

    // Mengeluarkan jumlah PNS
    public static int getCounterPNS() {
        return counterPNS;
    }
}

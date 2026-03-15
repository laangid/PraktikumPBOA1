/*
 * Nama File : Pegawai.java
 * Deskripsi : Berisi atribut dan method dalam class Pegawai
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.text.NumberFormat;

public abstract class Pegawai {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;
    
    /* METHOD */
    public Pegawai() {

    }

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return this.tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return this.tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String hitungMasaKerja() {
        LocalDate sekarang = LocalDate.now();
        Period masa = Period.between(tmt, sekarang);

        int tahun = masa.getYears();
        int bulan = masa.getMonths();

        return tahun + " tahun " + bulan + " bulan";
    }

    public int getMasaKerjaTahun() {
        LocalDate sekarang = LocalDate.now();
        Period masa = Period.between(tmt, sekarang);
        return masa.getYears();
    }

    public abstract LocalDate hitungTanggalPensiun();

    public abstract double hitungTunjangan();

    public abstract String getJabatan();

    public String formatTanggal(LocalDate tanggal) {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));

        return tanggal.format(formatter);
    }

    public String formatRupiah(double nilai) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(indonesia);

        return format.format(nilai);
    }

    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir : " +
            formatTanggal(getTanggalLahir()));
        System.out.println("TMT : " +
            formatTanggal(getTmt()));
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Masa Kerja : " + hitungMasaKerja());
        System.out.println("Tanggal Pensiun : " +
            formatTanggal(hitungTanggalPensiun()));
        System.out.println("Gaji Pokok : " +
            formatRupiah(getGajiPokok()));
        System.out.println("Tunjangan : " +
            formatRupiah(hitungTunjangan()));
    }
}

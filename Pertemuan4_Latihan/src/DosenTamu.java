/*
 * Nama File : DosenTamu.java
 * Deskripsi : Berisi atribut dan method dalam class DosenTamu
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

import java.time.LocalDate;

public class DosenTamu extends Dosen{
    /* ATRIBUT */
    private String nidk;
    private LocalDate tglBerakhirKontrak;
    
    /* METHOD */
    public DosenTamu() {
        
    }

    public DosenTamu(String nidk, LocalDate tglBerakhirKontrak, String fakultas, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(fakultas, nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidk = nidk;
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    public String getNidk() {
        return this.nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTglBerakhirKontrak() {
        return this.tglBerakhirKontrak;
    }

    public void setTglBerakhirKontrak(LocalDate tglBerakhirKontrak) {
        this.tglBerakhirKontrak = tglBerakhirKontrak;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        return tglBerakhirKontrak;
    }

    @Override
    public double hitungTunjangan() {
        return 0.025 * getGajiPokok();
    }

    @Override
    public String getJabatan() {
        return "Dosen Tamu";
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Tanggal berakhir kontrak: " + formatTanggal(tglBerakhirKontrak));
    }
}

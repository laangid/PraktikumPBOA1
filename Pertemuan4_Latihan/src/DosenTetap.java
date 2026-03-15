/*
 * Nama File : DosenTetap.java
 * Deskripsi : Berisi atribut dan method dalam class Dosentetap
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

import java.time.LocalDate;

public class DosenTetap extends Dosen{
    /* ATRIBUT */
    private String nidn;
    
    /* METHOD */
    public DosenTetap() {
        
    }

    public DosenTetap(String nidn, String fakultas, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(fakultas, nip, nama, tanggalLahir, tmt, gajiPokok);
        this.nidn = nidn;
    }

    public String getNidn() {
        return this.nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTanggalLahir().plusYears(65);
        pensiun = pensiun.plusMonths(1);
        pensiun = pensiun.withDayOfMonth(1);

        return pensiun;
    }

    @Override
    public double hitungTunjangan() {
        int masaKerja = getMasaKerjaTahun();

        return 0.02 * masaKerja * getGajiPokok();
    }

    @Override
    public String getJabatan() {
        return "Dosen Tetap";
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + nidn);
    }
}

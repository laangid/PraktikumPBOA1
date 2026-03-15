/*
 * Nama File : Tendik.java
 * Deskripsi : Berisi atribut dan method dalam class Tendik
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

import java.time.LocalDate;

public class Tendik extends Pegawai{
    /* ATRIBUT */
    private String bidang;
    
    /* METHOD */
    public Tendik() {
        
    }

    public Tendik(String bidang, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return this.bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    @Override
    public LocalDate hitungTanggalPensiun() {
        LocalDate pensiun = getTanggalLahir().plusYears(55);
        pensiun = pensiun.plusMonths(1);
        pensiun = pensiun.withDayOfMonth(1);

        return pensiun;        
    }

    @Override
    public double hitungTunjangan() {
        int masaKerja = getMasaKerjaTahun();

        return 0.01 * masaKerja * getGajiPokok();
    }

    @Override
    public String getJabatan() {
        return "Tenaga Kependidikan";
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
    }
}

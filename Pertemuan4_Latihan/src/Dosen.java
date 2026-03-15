/*
 * Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

import java.time.LocalDate;

public abstract class Dosen extends Pegawai{
    /* ATRIBUT */
    private String fakultas;
    
    /* METHOD */
    public Dosen() {
        
    }

    public Dosen(String fakultas, String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas: " + fakultas);
    }
}

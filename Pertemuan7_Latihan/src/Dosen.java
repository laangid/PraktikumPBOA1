/*
 * Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Dosen extends CivitasAkademika{
    /* ATRIBUT */
    private String nip;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Dosen(String nama, String nip) {
        setNama(nama);
        this.nip = nip;
    }

    // Mengembalikan atribut nip
    public String getNip() {
        return this.nip;
    }

    // Mengeset nip Dosen dengan nilai baru
    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    // Mengembalikan atribut nip
    public String getNomor() {
        return this.nip;
    }
}

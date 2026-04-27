/*
 * Nama File : CivitasAkademika.java
 * Deskripsi : Berisi atribut dan method dalam class CivitasAkademika
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class CivitasAkademika {
    /* ATRIBUT */
    private String nama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public CivitasAkademika() {
        this.nama = "-";
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengeset nama CivitasAkademika dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan atribut nama
    public String getNomor() {
        return "-";
    }
}

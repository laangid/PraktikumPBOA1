/*
 * nama File : Datum.java
 * Deskripsi : Berisi atribut dan method dalam class Datum
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Datum<T> {
    /* ATRIBUT */
    private T isi;

    /* METHOD */
    // Mengembalikan atribut isi
    public T getIsi() {
        return this.isi;
    }

    // Mengeset atribut isi dengan nilai baru
    public void setIsi(T isi) {
        this.isi = isi;
    }
}
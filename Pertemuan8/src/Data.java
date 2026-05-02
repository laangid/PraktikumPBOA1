/*
 * nama File : Data.java
 * Deskripsi : Berisi atribut dan method dalam class Data
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Data<D> {
    /* ATRIBUT */
    private Object[] ruang;
    private int banyak;

    /* METHOD */
    // Konstruktor
    public Data() {
        this.ruang = new Object[100];
        this.banyak = 0;
    }

    // Mengambil elemen pada posisi tertentu
    @SuppressWarnings("unchecked")
    public D getIsi(int posisi) {
        return (D) this.ruang[posisi - 1];
    }

    // Mengisi elemen pada posisi tertentu
    public void setIsi(int posisi, D objek) {
        this.ruang[posisi - 1] = objek;
        this.banyak++;
    }

    // Mengembalikan banyak elemen efektif
    public int getSize() {
        return this.banyak;
    }    
}

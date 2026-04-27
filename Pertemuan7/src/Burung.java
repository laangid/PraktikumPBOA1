/*
 * nama File : Burung.java
 * Deskripsi : Berisi atribut dan method dalam class Burung
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
*/

public class Burung extends Anabul{
    /* ATRIBUT */
    

    /* METHOD */
    // Konstruktor untuk membuat Burung dengan parameter
    public Burung(String nama) {
        setNama(nama);
    }

    @Override
    public String gerak() {
        return "terbang";
    }

    @Override
    public String bersuara() {
        return "cuit";
    }
}

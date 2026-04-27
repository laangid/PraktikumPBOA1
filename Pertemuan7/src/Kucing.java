/*
 * nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam class Kucing
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
*/

public class Kucing extends Anabul {
    /* ATRIBUT */
    

    /* METHOD */
    // Konstruktor untuk membuat Kucing dengan parameter
    public Kucing(String nama) {
        setNama(nama);
    }

    @Override
    public String gerak() {
        return "melata";
    }

    @Override
    public String bersuara() {
        return "meong";
    }    
}

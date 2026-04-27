/*
 * nama File : Anjing.java
 * Deskripsi : Berisi atribut dan method dalam class Anjing
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
*/

public class Anjing extends Anabul{
    /* ATRIBUT */
    

    /* METHOD */
    // Konstruktor untuk membuat Anjing dengan parameter
    public Anjing(String nama) {
        setNama(nama);
    }

    @Override
    public String gerak() {
        return "melata";
    }

    @Override
    public String bersuara() {
        return "guk-guk";
    } 
}

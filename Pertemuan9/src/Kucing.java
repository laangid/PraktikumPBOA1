/*
 * nama File : Kucing.java
 * Deskripsi : Berisi atribut dan method dalam class Kucing
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Kucing extends Anabul {
    /* ATRIBUT */
    private double bobot; 

    /* METHOD */
    // Konstruktor untuk membuat Kucing dengan parameter
    public Kucing(String nama) {
        setNama(nama);
    }

    // Konstruktor untuk membuat Kucing tanpa parameter
    public Kucing() {
        
    }

    // Mengembalikan atribut bobot
    public double getBobot() {
        return this.bobot;
    }

    // Mengeset bobot kucing dengan nilai baru
    public void setBobot(double bobot) {
        this.bobot = bobot;
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

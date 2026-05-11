/*
 * nama File : Anabul.java
 * Deskripsi : Berisi atribut dan method dalam class Anabul
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Anabul {
    /* ATRIBUT */
    private String nama;
    private String panggilan;

    /* METHOD */
    // Konstruktor untuk membuat Anabul tanpa parameter
    public Anabul() {
        this.nama = "-";
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengeset nama anabul dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengembalikan atribut panggilan
    public String getPanggilan() {
        return this.panggilan;
    }

    // Mengeset panggilan anabul dengan nilai baru
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public String gerak() {
        return "-";
    }

    public String bersuara() {
        return "-";
    }    
}

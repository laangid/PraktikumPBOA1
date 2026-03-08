/*
 * Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 2 Maret 2026
*/

public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* METHOD */
    // Konstruktor untuk membuat Kendaraan beserta isi atributnya
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    
    // Konstruktor tanpa parameter
    public Kendaraan() {
        this("-", "-");
    }

    // Mengembalikan atribut noPlat
    public String getNoPlat() {
        return this.noPlat;
    }

    // Mengembalikan atribut jenis
    public String getJenis() {
        return this.jenis;
    }

    // Mengeset noPlat dengan nilai baru
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    // Mengeset jenis dengan nilai baru
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Mencetak detail Kendaraan
    public void printKendaraan() {
        System.out.println("NoPlat: " + this.noPlat);
        System.out.println("Jenis: " + this.jenis);
    }
}

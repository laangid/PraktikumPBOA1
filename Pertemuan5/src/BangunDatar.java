/*
 * Nama File : BangunDatar.java
 * Deskripsi : Berisi atribut dan method dalam class BangunDatar
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

public abstract class BangunDatar {
    /* ATRIBUT */
    private int jmlSisi;
    private String warna;
    private String border;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public BangunDatar() {

    }

    // Konstruktor untuk membuat BangunDatar beserta isi atributnya
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    // Mengembalikan atribut jmlSisi
    public int getJmlSisi() {
        return this.jmlSisi;
    }

    // Mengeset jmlSisi dengan nilai baru
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    } 

    // Mengembalikan atribut warna
    public String getWarna() {
        return this.warna;
    }

    // Mengeset warna dengan nilai baru
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Mengembalikan atribut border
    public String getBorder() {
        return this.border;
    }

    // Mengeset border dengan nilai baru
    public void setBorder(String border) {
        this.border = border;
    }

    // Abstrac method untuk mengenbalikan luas
    public abstract double getLuas();

    // Abstrac method untuk mengenbalikan keliling
    public abstract double getKeliling();

    // Memeriksa apakah luas 2 bangun datar sama atau tidak
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Memeriksa apakah keliling 2 bangun datar sama atau tidak
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // Mencetak detail bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas: " + getLuas());
    }
    
}

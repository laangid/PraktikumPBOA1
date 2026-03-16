/*
 * Nama File : Persegi.java
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

public class Persegi extends BangunDatar implements IResize {
    /* ATRIBUT */
    private double sisi;
    
    /* METHOD */
    // Konstruktor tanpa parameter
    public Persegi() {

    }

    // Konstruktor untuk membuat Persegi beserta isi atributnya
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Mengembalikan atribut sisi
    public double getSisi() {
        return this.sisi;
    }

    // Mengeset sisi dengan nilai baru
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    // Mengembalikan luas persegi
    public double getLuas() {
        return this.sisi * this.sisi;
    }

    @Override
    // Mengembalikan keliling persegi
    public double getKeliling() {
        return this.sisi * 4;
    }

    // Mengembalikan diagonal persegi
    public double getDiagonal() {
        return Math.sqrt((this.sisi * this.sisi) * 2);
    }

    @Override
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    // Menambah ukuran menjadi 10% lebih kecil
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent) {
        sisi = sisi * percent / 100;
    }

    @Override
    // Mencetak detail persegi
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

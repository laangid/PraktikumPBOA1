/*
 * Nama File : Persegi.java
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

public class Persegi extends BangunDatar {
    /* ATRIBUT */
    private double sisi;
    
    /* METHOD */
    public Persegi() {

    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return this.sisi * this.sisi;
    }

    public double getKeliling() {
        return this.sisi * 4;
    }

    public double getDiagonal() {
        return Math.sqrt((this.sisi * this.sisi) * 2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

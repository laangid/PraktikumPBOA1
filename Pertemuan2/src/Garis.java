/*
 * Nama File : Garis.java
 * Deskripsi : Berisi atribut dan method dalam class Garis
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 23 Februari 2026
*/

public class Garis {
    /* ATRIBUT */
    private Titik tiwal;
    private Titik tikhir;
    private static int counterGaris = 0;

    /* METHOD */
    // Konstruktor untuk membuat garis dengan nilai titik awal dan titik akhir tertentu
    public Garis(Titik tiwal, Titik tikhir) {
        this.tiwal = tiwal;
        this.tikhir = tikhir;
        counterGaris++;
    }
    
    // Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis() {
        this(new Titik(0,0), new Titik(1,1));
    }

    // Mengembalikan nilai titik awal
    public Titik getTiwal() {
        return this.tiwal;
    }

    // Mengembalikan nilai titik akhir
    public Titik getTikhir() {
        return this.tikhir;
    }

    // Mengembalikan nilai counterGaris
    public static int getCounterGaris(){
        return counterGaris;
    }

    // Mengeset titik awal dengan titik baru T
    public void setTiwal(Titik T) {
        this.tiwal = T;
    }

    // Mengeset titik akhir dengan titik baru T
    public void setTikhir(Titik T) {
        this.tikhir = T;
    }

    // Mengembalikan panjang garis
    public double getPanjang() {
        double dx = this.tikhir.getAbsis() - this.tiwal.getAbsis();
        double dy = this.tikhir.getOrdinat() - this.tiwal.getOrdinat();

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    // Mengembalikan gradien garis
    public double getGradien() {
        double dy = this.tikhir.getOrdinat() - this.tiwal.getOrdinat();
        double dx = this.tikhir.getAbsis() - this.tiwal.getAbsis();

        return dy / dx;
    }

    // Mengembalikan koordinat titik tengah dari sebuah garis
    public Titik getTikTengah() {
        double absis = (this.tikhir.getAbsis() + this.tiwal.getAbsis()) / 2;
        double ordinat = (this.tikhir.getOrdinat() + this.tiwal.getOrdinat()) / 2;

        return new Titik(absis, ordinat);
    }

    // Memeriksa apakah garis sejajar dengan garis lainnya
    public boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }

    // Memeriksa apakah garis tegak lurus dengan garis lainnya
    public boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }

    // Mencetak titik awal dan titik akhir dari sebuah garis
    public void printGaris() {
        System.out.println("Garis (" + this.tiwal.getAbsis() + "," + this.tiwal.getOrdinat() + 
                            "), (" + this.tikhir.getAbsis() + "," + this.tikhir.getOrdinat() + ")");
    }

    // Mencetak persamaan garis dalam bentuk string y = mx + c.
    public void PrintPersamaan() {
        double m = this.getGradien();
        double c = this.tiwal.getOrdinat() - (m * this.tiwal.getAbsis());
        System.out.println("y = " + m + "x + " + c);
    }
}

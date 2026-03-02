/**
 * Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 23 Februari 2026
 */

public class Titik {
    /* ATRIBUT */
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /* METHOD */
    // Konstruktor untuk membuat titik dengan nilai absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor untuk membuat titik (0,0)
    public Titik() {
        this(0,0);
    }

    // Mengembalikan nilai counterTitik
    public static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return this.absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return this.ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        this.absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    }

    // Mengembalikan kuadran dari titik
    public int getKuadran() {
        if (this.absis > 0) {
            if (this.ordinat > 0) {
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            if (this.ordinat > 0) {
                return 2;
            }
            else {
                return 3;
            }
        }
    }

    // Menghasilkan jarak titik terhadap koordinat (0,0)
    public double getJarakPusat() {
        return Math.sqrt((this.absis * this.absis) + (this.ordinat * this.ordinat));
    }

    // Menghasilkan jarak titik terhadap titik yang ditentukan
    public double getJarak(Titik T) {
        double dx = this.absis - T.absis;
        double dy = this.ordinat - T.ordinat;

        return Math.sqrt((dx * dx) + (dy * dy));
    }

    // Merefleksikan titik terhadap sumbu X
    public void refleksiX() {
        this.ordinat = - this.ordinat;
    }

    // Merefleksikan titik terhadap sumbu Y
    public void refleksiY() {
        this.absis = - this.absis;
    }

    // Menghasilkan titik baru yang merupakan hasil refleksi sumbu X dari sebuah objek titik
    public Titik getRefleksiX() {
        return new Titik(this.absis, - this.ordinat);
    }

    // Menghasilkan titik baru yang merupakan hasil refleksi sumbu Y dari sebuah objek titik
    public Titik getRefleksiY() {
        return new Titik(- this.absis, this.ordinat);
    }
}
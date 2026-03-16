/*
 * Nama File : Lingkaran.java
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 16 Maret 2026
*/

public class Lingkaran extends BangunDatar implements IResize{
    /* ATRIBUT */
    private double jari;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Lingkaran(){
        setJmlSisi(1);
    }

    // Konstruktor untuk membuat lingkaran beserta isi atributnya
    public Lingkaran (double diameter, String warna, String border){
        this.jari = diameter/2;
        setWarna(warna);
        setBorder(border);
    }

    // Mengembalikan atribut jari
    public double getJari (){
        return jari; 
    }

    // Mengeset jari dengan nilai baru
    public void setJari(double jari){
        this.jari = jari;
    }

    @Override
    // Mengembalikan luas lingkaran
    public double getLuas(){
        return Math.PI * jari * jari;
    }

    @Override
    // Mengembalikan keliling lingkaran
    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    // Menambah ukuran menjadi 10% lebih besar
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    // Menambah ukuran menjadi 10% lebih kecil
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    // Menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent) {
        jari = jari * percent / 100;
    }

    @Override
    // Mencetak detail lingkaran
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari: " + jari);
    }
}

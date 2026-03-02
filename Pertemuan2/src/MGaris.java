/*
 * Nama File : MTitik.java
 * Deskripsi : Main class untuk menguji class Garis
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 23 Februari 2026
 */
public class MGaris {
    public static void main(String[] args) { 
        Garis G1 = new Garis();
        Garis G2 = new Garis(new Titik(-2,0), new Titik(0,4));

        System.out.print("Titik awal G1: ");
        G1.getTiwal().printTitik();
        System.out.print("Titik akhir G1: ");
        G1.getTikhir().printTitik();
        System.out.println("Jumlah garis: " + Garis.getCounterGaris());

        G1.setTiwal(new Titik(3,5));
        G1.setTikhir(new Titik(0,0));
        System.out.print("G1 setelah set titik awal & akhir: ");
        G1.printGaris();

        System.out.println("Gradien G1: " + G1.getGradien());
        System.out.print("Titik Tengah G1: ");
        G1.getTikTengah().printTitik();

        System.out.println("Apakah G1 sejajar dgn G2? " + G1.isSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dgn G2? " + G1.isTegakLurus(G2));

        System.out.print("Persamaan G2: ");
        G2.PrintPersamaan();
    }
}

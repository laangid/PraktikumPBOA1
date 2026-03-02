/*
 * Nama File : MTitik.java
 * Deskripsi : Main class untuk menguji class Titik
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 23 Februari 2026
 */
public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3,5);

        System.out.println("Jumlah titik: " + Titik.getCounterTitik());

        T1.setAbsis(2);
        T1.setOrdinat(4);
        System.out.println("Absis T1: " + T1.getAbsis());
        System.out.println("Ordinat T1: " + T1.getOrdinat());

        T2.geser(-5, -3);
        System.out.print("T2 setelah geser: ");
        T2.printTitik();

        System.out.println("Kuadran T2: " + T2.getKuadran());

        System.out.println("Jarak T1 ke (0, 0): " + T1.getJarakPusat());

        System.out.println("Jarak T1 ke T2: " + T1.getJarak(T2));

        T1.refleksiX();
        T1.refleksiY();
        System.out.print("T1 setelah refleksi terhadap x dan y: ");
        T1.printTitik();

        System.out.print("Titik hasil merefleksikan T1 terhadap sumbu X: ");
        T1.getRefleksiX().printTitik();

        System.out.print("Titik hasil merefleksikan T1 terhadap sumbu Y: ");
        T1.getRefleksiY().printTitik();
    }
}
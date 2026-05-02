/*
 * Nama File : Main.java
 * Deskripsi : Main class untuk menguji relasi antar objek dengan objek class lainnya
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
 */

public class Main {
    public static void main(String[] args) {
        // BAGIAN I
        System.out.println("\n===== BAGIAN I - CLASS GENERIK =====");
        // Datum Anabul
        Datum<Anabul> kotakAnabul = new Datum<>();

        Anjing anjing = new Anjing("Buddy");
        kotakAnabul.setIsi(anjing);
        System.out.println("Nama  : " + kotakAnabul.getIsi().getNama());
        System.out.println("Suara : " + kotakAnabul.getIsi().bersuara());
        System.out.println("Gerak : " + kotakAnabul.getIsi().gerak());

        System.out.println("---");

        Burung burung = new Burung("Tweety");
        kotakAnabul.setIsi(burung);
        System.out.println("Nama  : " + kotakAnabul.getIsi().getNama());
        System.out.println("Suara : " + kotakAnabul.getIsi().bersuara());
        System.out.println("Gerak : " + kotakAnabul.getIsi().gerak());

        System.out.println("---");

        // Datum kucing
        Datum<Kucing> kotakKucing = new Datum<>();

        Anggora anggora = new Anggora("Mochi", 3.5);
        kotakKucing.setIsi(anggora);
        System.out.println("Nama  : " + kotakKucing.getIsi().getNama());
        System.out.println("Bobot : " + kotakKucing.getIsi().getBobot() + " kg");
        System.out.println("Suara : " + kotakKucing.getIsi().bersuara());

        System.out.println("---");

        Kembangtelon kembangtelon = new Kembangtelon("Belang", 4.2);
        kotakKucing.setIsi(kembangtelon);
        System.out.println("Nama  : " + kotakKucing.getIsi().getNama());
        System.out.println("Bobot : " + kotakKucing.getIsi().getBobot() + " kg");
        System.out.println("Suara : " + kotakKucing.getIsi().bersuara());


        // BAGIAN II
        System.out.println("\n===== BAGIAN II - OPERATOR GENERIK =====");
        OperatorGenerik op = new OperatorGenerik();

        // Tukar Integer
        Datum<Integer> angka1 = new Datum<>();
        Datum<Integer> angka2 = new Datum<>();
        angka1.setIsi(3);
        angka2.setIsi(6);
        System.out.println("Sebelum tukar: angka1=" + angka1.getIsi() + ", angka2=" + angka2.getIsi());
        op.Tukar(angka1, angka2);
        System.out.println("Sesudah tukar: angka1=" + angka1.getIsi() + ", angka2=" + angka2.getIsi());

        System.out.println("---");

        // Tukar String
        Datum<String> kata1 = new Datum<>();
        Datum<String> kata2 = new Datum<>();
        kata1.setIsi("Halo");
        kata2.setIsi("Dunia");
        System.out.println("Sebelum tukar: kata1=" + kata1.getIsi() + ", kata2=" + kata2.getIsi());
        op.Tukar(kata1, kata2);
        System.out.println("Sesudah tukar: kata1=" + kata1.getIsi() + ", kata2=" + kata2.getIsi());

        System.out.println("---");

        // Tukar Anabul
        Datum<Anabul> hewan1 = new Datum<>();
        Datum<Anabul> hewan2 = new Datum<>();
        hewan1.setIsi(anjing);
        hewan2.setIsi(anggora);
        System.out.println("Sebelum tukar: hewan1=" + hewan1.getIsi().getNama() + ", hewan2=" + hewan2.getIsi().getNama());
        op.Tukar(hewan1, hewan2);
        System.out.println("Sesudah tukar: hewan1=" + hewan1.getIsi().getNama() + ", hewan2=" + hewan2.getIsi().getNama());

        System.out.println("---");

        // jumlah bobot 2 kucing
        Datum<Kucing> kucingA = new Datum<>();
        Datum<Kucing> kucingB = new Datum<>();
        kucingA.setIsi(anggora);
        kucingB.setIsi(kembangtelon);
        System.out.println("Bobot2: " + op.Bobot2(kucingA, kucingB) + " kg");


        // BAGIAN III   
        System.out.println("\n===== BAGIAN III - LARIK GENERIK =====");
        Data<Anabul> dataAnabul = new Data<>();

        dataAnabul.setIsi(1, anjing);
        dataAnabul.setIsi(2, burung);
        dataAnabul.setIsi(3, anggora);
        dataAnabul.setIsi(4, kembangtelon);

        System.out.println("Jumlah elemen: " + dataAnabul.getSize());

        System.out.println("Elemen 1: " + dataAnabul.getIsi(1).getNama() + " - " + dataAnabul.getIsi(1).bersuara());
        System.out.println("Elemen 2: " + dataAnabul.getIsi(2).getNama() + " - " + dataAnabul.getIsi(2).bersuara());
        System.out.println("Elemen 3: " + dataAnabul.getIsi(3).getNama() + " - " + dataAnabul.getIsi(3).bersuara());
        System.out.println("Elemen 4: " + dataAnabul.getIsi(4).getNama() + " - " + dataAnabul.getIsi(4).bersuara());

        // CARA KERJA KONSEP GENERIK
        /* Generik memungkinkan kita membuat kelas atau method yang dapat bekerja dengan berbagai tipe data tanpa harus
           mendefinisikannya dari awal. Tipe data baru ditentukan saat kelas atau method tersebut digunakan, bukan saat
           didefinisikan.
           
           Contohnya, kelas Datum<T> dapat menyimpan objek bertipe Anjing, Kucing, maupun Integer hanya dengan mengganti
           tipe T saat deklarasi. Tanpa generik, kita harus membuat kelas terpisah untuk setiap tipe data yang ingin disimpan.

           Generik juga dapat dibatasi menggunakan extends agar hanya menerima tipe tertentu dan keturunannya, seperti 
           <T extends Kucing> yang hanya menerima Kucing, Anggora, dan Kembangtelon. Kesimpulannya, generik membuat kode lebih 
           fleksibel, efisien, dan tidak perlu ditulis berulang hanya karena perbedaan tipe data.
        */
    }
}
/*
 * Nama File : MPiaraan.java
 * Deskripsi : Main class untuk melakukan pengujian atribut dan method yang ada
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 10 Mei 2026
 */

public class MPiaraan {
    public static void main(String[] args) {
        // Object Piaraan
        Piaraan klinik = new Piaraan();
 
        // Object hewan
        Kucing kucing1 = new Kucing("Kucing Persia");
        kucing1.setPanggilan("Miaw");
        kucing1.setBobot(3.5);
 
        Anjing anjing1 = new Anjing("Anjing Bulldog");
        anjing1.setPanggilan("Doggy");
 
        Burung burung1 = new Burung("Burung Lovebird");
        burung1.setPanggilan("Kicau");
 
        Anggora anggora = new Anggora("Anggora Premium", 4.2);
        anggora.setPanggilan("Antik");
 
        Kembangtelon kembang = new Kembangtelon("Kembang Telon Lucu", 2.8);
        kembang.setPanggilan("Kembang");
 
        // enqueue
        klinik.enqueueAnabul(kucing1);
        klinik.enqueueAnabul(anjing1);
        klinik.enqueueAnabul(burung1);
        klinik.enqueueAnabul(anggora);
        klinik.enqueueAnabul(kembang);
 
        System.out.println("\nTotal hewan dalam antrian: " + klinik.getNbelm() + "\n");
 
        // showAnabul
        klinik.showAnabul();
 
        // getAnabul
        Anabul hDepan = klinik.getAnabul();
        System.out.println("\nHewan di antrean terdepan: " + hDepan.getPanggilan());
 
        // dequeue
        Anabul hSelesai = klinik.dequeueAnabul();
        System.out.println("\nSelesai diperiksa: " + hSelesai.getPanggilan());
        System.out.println("Total antrean: " + klinik.getNbelm());
 
        // isMember
        System.out.println("\nApakah Miaw masih dalam antrian? " +  klinik.isMember(kucing1));
        System.out.println("Apakah Doggy masih dalam antrian? " + klinik.isMember(anjing1) + "\n");
 
        // showJenisAnabul
        klinik.showJenisAnabul();
 
        // countKucing
        int jmlhKucing = klinik.countKucing();
        System.out.println("\nJumlah kucing: " + jmlhKucing);
 
        // bobotKucing
        double totalBobot = klinik.bobotKucing();
        System.out.println("\nTotal bobot kucing: " + totalBobot);

        // Renungan
        // Koleksi adalah cara menyimpan banyak data sejenis dalam satu struktur yang terorganisir, sehingga data bisa diakses dan dikelola dengan mudah tanpa perlu
        // membuat banyak variabel terpisah. Misal saya punya 50 teman, tanpa koleksi, saya harus membuat 50 variabel String (teman1, teman2, teman3, dll).
        // Ini sangat tidak praktis dan membuat kode sulit dibaca. Koleksi memecahkan masalah ini dengan menyediakan satu tempat terpusat untuk menyimpan semua
        // data sekaligus. Hal ini membuat saya bisa menambah, menghapus, mencari, atau mengubah elemen dengan operasi yang sederhana dan konsisten.

        // Dalam praktikum ini, saya mempelajari dua jenis koleksi dengan perilaku berbeda. List (Soal 1 - Teman) adalah koleksi yang fleksibel. Saya bisa menambah,
        // menghapus, atau mengubah elemen di posisi mana saja tanpa batasan urutan. List cocok untuk kasus seperti daftar teman, di mana urutan tidak penting. 
        // Sementara itu, Queue (Soal 2 - Piaraan) menerapkan prinsip FIFO, di mana hanya bisa menambah dari belakang dan mengambil dari depan. Queue cocok untuk
        // antrian. Contohnya di klinik hewan. Hewan yang datang duluan harus dirawat duluan. Ini memastikan sistem adil dan teratur.
    }
}
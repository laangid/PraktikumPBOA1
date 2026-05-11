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
    }
}
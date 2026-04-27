/*
 * Nama File : Seminar.java
 * Deskripsi : Berisi atribut dan method dalam class Seminar
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Seminar {
    /* ATRIBUT */
    private CivitasAkademika[] pesertas = new CivitasAkademika[100];
    private int banyakPeserta;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Seminar() {
        this.banyakPeserta = 0;
    }

    // Mengembalikan jumlah peserta
    public int countPeserta() {
        return this.banyakPeserta;
    }

    // Menambahkan peserta ke seminar
    public void registrasi(CivitasAkademika ca) {
        if (this.banyakPeserta < 100) {
            this.pesertas[this.banyakPeserta] = ca;
            this.banyakPeserta++;
        } else {
            System.out.println("Seminar penuh!");
        }
    }

    // Menampilkan daftar nomor dan nama semua peserta
    public void tampilPeserta() {
        for (int i = 0; i < this.banyakPeserta; i++) {
            System.out.println("Nomor: " + pesertas[i].getNomor() + 
                               " | Nama: " + pesertas[i].getNama());
        }
    }

    // Menghitung banyaknya peserta mahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < this.banyakPeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}

/*
 * Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 2 Maret 2026
*/

public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    /* METHOD */
    // Konstruktor untuk membuat Dosen beserta isi atributnya
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Konstruktor tanpa parameter
    public Dosen() {
        this("-", "-", "-");
    }

    // Mengembalikan atribut nip
    public String getNip() {
        return this.nip;
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan atribut prodi
    public String getProdi() {
        return this.prodi;
    }

    // Mengeset nip dosen dengan nilai baru
    public void setNip(String nip) {
        this.nip = nip;
    }

    // Mengeset nama dosen dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengeset prodi dosen dengan nilai baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    
    // Mencetak detail dosen
    public void printDosen() {
        System.out.println("Nip: " + this.nip);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }
}

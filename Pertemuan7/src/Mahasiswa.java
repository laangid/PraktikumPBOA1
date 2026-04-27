/*
 * nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 20 April 2026
*/


public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String programStudi;

    /* METHOD */
    // Konstruktor untuk membuat Mahasiswa tanpa parameter
    public Mahasiswa() {
        this.nim = "-999";
        this.nama = "n/a";
        this.programStudi = "n/a";
    }

    // Konstruktor untuk membuat Mahasiswa beserta isi atributnya
    public Mahasiswa(String nim, String nama, String programStudi) {
        this.nim = nim;
        this.nama = nama;
        this.programStudi = programStudi;
    }

    // Konstruktor untuk membuat Mahasiswa dengan parameter objek mahasiswa
    public Mahasiswa(Mahasiswa M) {
        this.nim = M.nim;
        this.nama = M.nama;
        this.programStudi = M.programStudi;
    }

    // Mengembalikan atribut nim
    public String getNim() {
        return this.nim;
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan atribut programStudi
    public String getProgramStudi() {
        return this.programStudi;
    }

    // Mengeset nim mahasiswa dengan nilai baru
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mengeset nama mahasiswa dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengeset programStudi mahasiswa dengan parameter kosong
    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    // Mengeset programStudi mahasiswa dengan parameter string
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    // Mengeset programStudi mahasiswa dengan parameter objek mahasiswa
    public void setProgramStudi(Mahasiswa M) {
        this.programStudi = M.programStudi;
    }

    // Mencetak nam, nama, dan programStudi mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Program Studi: " + this.programStudi);
    }
}

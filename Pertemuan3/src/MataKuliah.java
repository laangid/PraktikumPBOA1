/*
 * Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class MataKuliah
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 2 Maret 2026
*/

public class MataKuliah {
    /* ATRIBUT */
    private String idMatKul;
    private String nama;
    private int sks;

    /* METHOD */
    // Konstruktor untuk membuat MataKuliah beserta isi atributnya
    public MataKuliah(String idMatKul, String nama, int sks) {
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // Konstruktor tanpa parameter
    public MataKuliah() {
        this("-", "-", 0);
    }

    // Mengembalikan atribut idMatKul
    public String getIdMatKul() {
        return this.idMatKul;
    }

    // Mengembalikan atribut nama mata kuliah
    public String getnama() {
        return this.nama;
    }

    // Mengembalikan atribut sks
    public int getSks() {
        return this.sks;
    }

    // Mengeset idMatKul dengan nilai baru
    public void setIdMatKul(String idMatKul) {
        this.idMatKul = idMatKul;
    }

    // Mengeset nama mata kuliah dengan nilai baru
    public void setnama(String nama) {
        this.nama = nama;
    }

    // Mengeset sks dengan nilai baru
    public void setSks(int sks) {
        this.sks = sks;
    }
    
    // Mencetak detail Mata Kuliah
    public void printMatKul() {
        System.out.println("IdMatKul: " + this.idMatKul);
        System.out.println("Nama: " + this.nama);
        System.out.println("Sks: " + this.sks);
    }
}

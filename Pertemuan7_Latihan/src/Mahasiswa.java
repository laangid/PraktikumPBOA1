/*
 * Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class Mahasiswa extends CivitasAkademika{
    /* ATRIBUT */
    private String nim;
    private Dosen dosenWali;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Mahasiswa(String nama, String nim) {
        setNama(nama);
        this.nim = nim;
    }

    // Mengembalikan atribut nim
    public String getNim() {
        return this.nim;
    }

    // Mengembalikan atribut dosen wali
    public Dosen getWali() {
        return this.dosenWali;
    }

    // Mengeset nim Mahasiswa dengan nilai baru
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mengeset dosen wali dengan nilai baru
    public void setWali(Dosen doswal) {
        this.dosenWali = doswal;
    }

    @Override
    // Mengembalikan atribut nim
    public String getNomor() {
        return this.nim;
    }

    // Mencetak nam, nama, dan prodi mahasiswa
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + getNama());
        System.out.println("Dosen Wali: " + dosenWali.getNama());
    }
}

/*
 * Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 2 Maret 2026
*/

import java.util.ArrayList;

public class Mahasiswa {
    /* ATRIBUT */
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;
    private static int counterMhs = 0;

    /* METHOD */
    // Konstruktor untuk membuat Mahasiswa beserta isi atributnya
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        counterMhs++;
    }

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this("-", "-", "-");
    }

    // Mengembalikan atribut nim
    public String getNim() {
        return this.nim;
    }

    // Mengembalikan atribut nama
    public String getNama() {
        return this.nama;
    }

    // Mengembalikan atribut prodi
    public String getProdi() {
        return this.prodi;
    }

    // Mengembalikan atribut matkul
    public ArrayList<MataKuliah> getMatkul() {
        return this.listMatKul;
    }

    // Mengembalikan atribut dosen wali
    public Dosen getDosenWali() {
        return this.dosenwali;
    }

    // Mengembalikan atribut kendaraan
    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    // Mengeset nim mahasiswa dengan nilai baru
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mengeset nama mahasiswa dengan nilai baru
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Mengeset prodi mahasiswa dengan nilai baru
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // Mengeset mata kuliah dengan nilai baru
    public void setMatKul(ArrayList<MataKuliah> listMatKul) {
        this.listMatKul = listMatKul;
    }

    // Mengeset dosen wali dengan nilai baru
    public void setDosWal(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }

    // Mengeset kendaraan dengan nilai baru
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Menambahkan Mata Kuliah ke atribut listMatkul
    public void addMatKul(MataKuliah MK) {
        if (listMatKul == null) {
            listMatKul = new ArrayList<MataKuliah>();
        }
        if (listMatKul.size() < 50) {
            listMatKul.add(MK);
        }  
    }

    // Mengembalikan total SKS yang diambil oleh mahasiswa
    public int getJumlahSKS() {
        int total = 0;

        if (listMatKul != null) {
            for (MataKuliah mk : listMatKul) {
                total += mk.getSks();
            }
        }

        return total;  
    }

    // Mengembalikan total mata kuliah yang diambil oleh mahasiswa
    public int getJumlahMatKul() {
        if (listMatKul == null) {
            return 0;
        }
        return listMatKul.size();         
    }

    // Mencetak nam, nama, dan prodi mahasiswa
    public void printMhs() {
        System.out.println("Nim: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Prodi: " + this.prodi);
    }

    // Mencetak nam, nama, prodi, daftar mata kuliah, dosen wali, dan kendaraan mahasiswa
    public void printDetailMhs() {
        printMhs();

        System.out.println("\nMATA KULIAH YANG DIAMBIL");
        if (listMatKul != null) {
            for (MataKuliah mk : listMatKul) {
                mk.printMatKul();
            }
        }

        System.out.println("\nDOSEN WALI");
        if (dosenwali != null) {
            dosenwali.printDosen();
        }

        System.out.println("\nKENDARAAN");
        if (kendaraan != null) {
            kendaraan.printKendaraan();
        }
            
    }

    // Mengembalikan jumlah mahasiswa
    public static int getCounterMhs(){
        return counterMhs;
    }
}

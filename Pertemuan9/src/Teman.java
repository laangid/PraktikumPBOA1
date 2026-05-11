/*
 * Nama File : Teman.java
 * Deskripsi : Berisi atribut dan method dalam class Teman
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 4 Mei 2026
*/

import java.util.List;
import java.util.ArrayList;

public class Teman {
    /* ATRIBUT */
    private int nbelm;
    private List<String> Lnama;

    /* METHOD */
    // Konstruktor tanpa parameter
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // Mengembalikan atribut nbelm
    public int getNbelm() {
        return this.nbelm;
    }

    // Mengembalikan nama
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < this.nbelm) {
            return Lnama.get(indeks);
        } else {
            return null;
        }
    }

    // Mengeset Nama dengan nilai baru
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < this.nbelm) {
            Lnama.set(indeks, nama);
        }
    }

    // Menambahkan nama baru
    public void addNama(String nama) {
        this.Lnama.add(nama);
        this.nbelm++;
    }

    // Menghapus nama dari list
    public void delNama(String nama) {
        for (int i = 0; i < this.nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.remove(i);
                this.nbelm--;
                break;
            }
        }
    }

    // Memeriksa apakah suatu nama ada dalam list
    public boolean isMember(String nama) {
        for (int i = 0; i < this.nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                return true;
            }
        }
        return false;
    }

    // Mengubah nama lama mejadi nama baru
    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < this.nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
                break;
            }
        }
    }

    // Menghitung kemunculan nama tertentu
    public int countNama(String nama) {
        int count = 0;
        for (int i = 0; i < this.nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                count++;
            }
        }
        return count;       
    }

    // Menampilkan semua nama di list
    public void showTeman() {
        if (this.nbelm == 0) {
            System.out.println("Belum ada teman di list");
        } else {
            System.out.println("Daftar Teman:");
            for (int i = 0; i < this.nbelm; i++) {
                System.out.println(Lnama.get(i));
            }
        }
    }

}

/*
 * Nama File : Piaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Piaraan
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 10 Mei 2026
*/

import java.util.List;
import java.util.ArrayList;

public class Piaraan {
    /* ATRIBUT */
    private int nbelm;
    private List<Anabul> Lanabul;

    /* METHOD */
    // Konstruktor
    public Piaraan() {
        this.Lanabul = new ArrayList<>();
        this.nbelm = 0;
    }

    // Mengembalikan atribut nbelm
    public int getNbelm() {
        return this.nbelm;
    }

    // Menambah elemen di akhir
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    // Memeriksa apakah anabul terkait terdapat dalam list
    public boolean isMember(Anabul anabul) {
        for (int i = 0; i < nbelm; i++) {
            if (Lanabul.get(i).equals(anabul)) {
                return true;
            }
        }
        return false;
    }

    // Mengembalikan data anabul pertama dalam antrean
    public Anabul getAnabul() {
        if (nbelm == 0) {
            return null;
        } else {
            return this.Lanabul.get(0);
        }
    }

    // Mengambil anabul pertama sekaligus mengeluarkannya dari antrean
    public Anabul dequeueAnabul() {
        if (this.nbelm > 0) {
            Anabul Q = this.Lanabul.get(0);
            this.Lanabul.remove(0);
            this.nbelm--;
            return Q;
        } else {
            return null;
        }
    }

    // Menampilkan semua anabul di list
    public void showAnabul() {
        if (this.nbelm == 0) {
            System.out.println("Belum ada anabul di antrean");
        } else {
            System.out.println("Antrean: ");
            for (int i = 0; i < this.nbelm; i++) {
                System.out.println(this.Lanabul.get(i).getPanggilan());
            }
        }
    }

    // Menghitung banyak keluarga kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (int i = 0; i < this.nbelm; i++) {
            if (this.Lanabul.get(i) instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    // Menghitung bobot keluarga kucing dalam antrean
    public double bobotKucing() {
        double bobot = 0;
        for (int i = 0; i < this.nbelm; i++) {
            Anabul a = Lanabul.get(i);
            if (a instanceof Kucing) {
                Kucing k = (Kucing) a;
                bobot = bobot + k.getBobot();
            }
        }
        return bobot;
    }

    // Menampilkan nama-nama panggilan para anabul dalam antrean
    public void showJenisAnabul() {
        if (this.nbelm == 0) {
            System.out.println("Belum ada antrean");
        } else {
            System.out.println("Antrean disertai jenis:");
            for (int i = 0; i < this.nbelm; i++) {
                Anabul a = Lanabul.get(i);
                String nPanggilann = a.getPanggilan();
                String jenis = a.getClass().getName();
                System.out.println(nPanggilann + " (" + jenis + ")");
            }
        }
        
    }

}

/*
Nama FIle : Asersi2.java 
Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai 0
Pembuat   : Elang Fadila Ahmad
Tanggal   : 26 Maret 2026
*/

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0): "jari-jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }   
}

/*
Secara konsep, penggunaan asersi pada program Asersi2 kurang tepat karena digunakan untuk memvalidasi
nilai input (jari-jari lingkaran). Padahal, asersi seharusnya dipakai untuk memastikan kondisi internal
program yang memang diyakini benar oleh programmer. Dalam kasus ini, nilai jari-jari bisa saja bernilai nol
atau negatif, sehingga bukan sesuatu yang "tidak mungkin terjadi".

Kesalahan utamanya adalah menjadikan asersi sebagai alat validasi input. Validasi input seharusnya ditangani
dengan percabangan biasa atau menggunakan exception agar program tetap aman dan terkontrol. Jika hanya
mengandalkan asersi, maka ketika kondisi salah terjadi, program tidak benar-benar "menangani" masalah tersebut.

Selain itu, asersi di Java secara default tidak aktif saat program dijalankan. Jika program dijalankan
tanpa mengaktifkan asersi, maka pengecekan terhadap nilai jari-jari tidak akan dilakukan sama sekali. Hal ini
berbahaya karena program tetap berjalan meskipun input tidak valid, sehingga hasil perhitungan bisa
menjadi tidak benar tanpa adanya peringatan.
*/

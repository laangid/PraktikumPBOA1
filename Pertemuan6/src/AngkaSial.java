/*
Nama FIle : AngkaSial.java 
Deskripsi : Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws' 
Pembuat   : Elang Fadila Ahmad
Tanggal   : 26 Maret 2026
*/

public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();

        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch(AngkaSialException ase) {
            // method getMassage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*
Ketika eksepsi terjadi pada saat pemanggilan as.cobaAngka(13), baris 12 tidak akan dieksekusi. Hal ini
karena saat kondisi angka == 13 terpenuhi, program langsung menjalankan perintah throw new AngkaSialException()
sehingga alur eksekusi keluar dari method cobaAngka. Akibatnya, baris setelahnya dalam method tersebut,
termasuk perintah System.out.println(...) pada baris 12, tidak dijalankan.

Untuk baris 21, yaitu bagian catch(AngkaSialException ase), baris tersebut akan dieksekusi. Hal ini karena
ketika exception terjadi di dalam blok try, program akan langsung menghentikan eksekusi di dalam blok
tersebut dan berpindah ke blok catch. Dengan demikian, blok catch akan dijalankan untuk menangani
exception yang terjadi.
*/
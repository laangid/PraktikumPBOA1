/*
 * Nama File : BangunDatar.java
 * Deskripsi : Berisi atribut dan method dalam class BangunDatar
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 9 Maret 2026
*/

public class BangunDatar {
    /* ATRIBUT */
    private int jmlSisi;
    private String warna;
    private String border;
    
    /* METHOD */
    public BangunDatar() {

    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public int getJmlSisi() {
        return this.jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    } 

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return this.border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    
}

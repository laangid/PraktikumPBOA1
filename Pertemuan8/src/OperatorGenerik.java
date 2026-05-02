/*
 * nama File : OperatorGenerik.java
 * Deskripsi : Berisi atribut dan method dalam class OperatorGenerik
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 27 April 2026
*/

public class OperatorGenerik {
    /* ATRIBUT */

    /* METHOD */
    public <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public <G extends Kucing> double Bobot2(Datum<G> a, Datum<G> b) {
        return a.getIsi().getBobot() + b.getIsi().getBobot();
    }
}

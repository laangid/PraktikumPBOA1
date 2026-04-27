/*
 * Nama File : Coercion.java
 * Pembuat   : Elang Fadila Ahmad
 * NIM       : 24060124130108
 * Tanggal   : 20 april 2026
*/

public class Coercion {
    public static void main(String[] args) {
        
        // 1a
        int nilaiInt = 65;
        System.out.println("Sebagai int    : " + nilaiInt);
        
        char nilaiChar = (char) nilaiInt;
        System.out.println("Sebagai char   : " + nilaiChar);
        
        double nilaiDouble = (double) nilaiInt;
        System.out.println("Sebagai double : " + nilaiDouble);
        
        // 1b
        int kembalikanInt = (int) nilaiDouble;
        System.out.println("Kembali ke int : " + kembalikanInt);

        // 1c
        String X = "1234";
        String Y = "5678";

        String S = X + Y;
        System.out.println("Sebagai string: " + S);

        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Sebagai int: " + Z);

        // 1d
        String P = "12.34";
        String Q = "56.78";

        String R = P + Q;
        System.out.println("Sebagai string: " + R);

        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Sebagai double: " + D);

        // 1e
        Integer A = Integer.parseInt(S);
        System.out.println("Sebagai integer: " + A);

        // 1f
        String T = Integer.toString(A);
        System.out.println("Sebagai string: " + T);
    }
}
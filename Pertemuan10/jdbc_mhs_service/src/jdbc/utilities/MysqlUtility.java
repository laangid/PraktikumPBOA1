/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

/*
 * Nama File : MysqlUtility.java
 * Deskripsi : untuk mengelola koneksi dengan basis data yang digunakan
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 11 Mei 2026
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtility {
    private static Connection koneksi;

    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "";
                String user = "";
                String password = "";

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi berhasil");
            } catch (ClassNotFoundException e) {
                System.out.println("Gagal load driver: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Gagal koneksi: " + e.getMessage());
            }
        }

        return koneksi;
    }
}

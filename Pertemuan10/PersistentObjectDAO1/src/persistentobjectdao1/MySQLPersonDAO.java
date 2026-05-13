package persistentobjectdao1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Nama File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 * Pembuat   : Elang Fadila Ahmad
 * Tanggal   : 11 Mei 2026
*/

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {
        String name = person.getName();

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "",
            "",
            ""
        );

        String query = "INSERT INTO person(name) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);

        ps.executeUpdate();

        ps.close();
        con.close();

        System.out.println("Data berhasil disimpan: " + name);
    }
}
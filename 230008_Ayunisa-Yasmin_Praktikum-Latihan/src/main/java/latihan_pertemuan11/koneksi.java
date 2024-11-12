/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_pertemuan11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class koneksi {
    private static Connection koneksi;
    
    public static Connection koneksi() throws SQLException, ClassNotFoundException {
        try {
            if (koneksi == null) {
               Class.forName("com.mysql.cj.jdbc.Driver");
               koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db", "root", "");
                System.out.println("Koneksi Berhasil!");
            }
            return koneksi;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil!" + e.getMessage());
            throw e;
        }
    }
}

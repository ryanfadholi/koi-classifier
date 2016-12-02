/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EKoneksi {
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException{
         try{
            Class.forName("com.mysql.jdbc.Driver");
            //System.out.println("Berhasil load driver");
        }catch (ClassNotFoundException e){
            System.out.println("Tidak ada Driver"+e);
        }
        if(koneksi == null){
            //buat koneksi
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/coba_koiclassifier","root","");
        }
        return koneksi;
    }
}

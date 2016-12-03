
import Koneksi.EKoneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class CKlasifikasi {
      private EKoneksi c = new EKoneksi();
      String klasifikasi;
      int jumlah;
      
      public DefaultTableModel getKlasifikasiModel()
    {
        String ColName[] = {"klasifikasi"};
        DefaultTableModel TbModel = new DefaultTableModel(ColName, 0);
        try
        {
            Statement S = c.getConnection().createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM klasifikasi");
            R.first();
            do
            {
                TbModel.addRow(new Object[] {R.getString("nama_klasifikasi")});
            } while(R.next());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return TbModel;
    }
      
    public ArrayList<String> getKlasifikasiArray()
    {
        ArrayList<String> result = new ArrayList<String>();
        try
        {
            Statement S = c.getConnection().createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM klasifikasi");
            R.first();
            do
            {
                result.add(R.getString("nama_klasifikasi"));
            } while(R.next());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }
    
}

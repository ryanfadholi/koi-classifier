
import Koneksi.EKoneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
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
      
      public ArrayList<DataCitra> getAllImageData(){
          ArrayList<DataCitra> result = new ArrayList<>();
        try
        {
            Statement S = c.getConnection().createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM images");
            R.first();
            do
            {
                result.add(new DataCitra(R.getString("img_url"), 
                                         R.getString("klasifikasi"), 
                                         Double.parseDouble(R.getString("mean")),
                                         Double.parseDouble(R.getString("standard_deviasi")),
                                         Double.parseDouble(R.getString("entropy")))
                                        );
            } while(R.next());
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return result;
      }
      
      public void deleteKlasifikasi(String name){
        try
            {
                
                Statement st = EKoneksi.getConnection().createStatement();
                st.executeUpdate("DELETE FROM klasifikasi WHERE nama_klasifikasi='"+name+"'");
           
                JOptionPane.showMessageDialog(null, name + " berhasil dihapus.");
            }catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
      }
      
      public void deleteImage(String imageID){
        try
            {
                
                Statement st = EKoneksi.getConnection().createStatement();
                st.executeUpdate("DELETE FROM images WHERE img_url='"+imageID+"'");
           
                JOptionPane.showMessageDialog(null, "Citra " +imageID+ " berhasil dihapus.");
            }catch (SQLException e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
      }
      
      public DefaultTableModel getImages(){
            String ColName[] = {"ImageID","Klasifikasi","Mean","Standar Deviasi","Entropy"};
            DefaultTableModel TbModel = new DefaultTableModel(ColName, 0);
            try
            {
                Statement S = c.getConnection().createStatement();
                ResultSet R = S.executeQuery("SELECT * FROM images");
                
                R.first();
                do
                {
                    TbModel.addRow(new Object[] {R.getString("img_url"),
                    R.getString("klasifikasi"),
                    R.getString("mean"),
                    R.getString("standard_deviasi"),
                    R.getString("entropy")});
                } while(R.next());
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            return TbModel;
      }
      
       public DefaultTableModel getImages(String where){
            String ColName[] = {"ImageID","Klasifikasi","Mean","Standar Deviasi","Entropy"};
            DefaultTableModel TbModel = new DefaultTableModel(ColName, 0);
            try
            {
                Statement S = c.getConnection().createStatement();
                ResultSet R = S.executeQuery("SELECT * FROM images WHERE Klasifikasi='" + where + "'");
                if(!R.first()){
                    TbModel.addRow(new Object[] {"NO DATA", "NO DATA", "NO DATA", "NO DATA", "NO DATA"});
                    return TbModel;
                }
                R.beforeFirst();
                R.first();
                do
                {
                    TbModel.addRow(new Object[] {R.getString("img_url"),
                    R.getString("klasifikasi"),
                    R.getString("mean"),
                    R.getString("standard_deviasi"),
                    R.getString("entropy")});
                } while(R.next());
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
            return TbModel;
      }
      
    public DefaultTableModel getKlasifikasiModel() {
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
        ArrayList<String> result = new ArrayList<>();
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
    
     public void InsertNewImage(String klsf, double mean, double sd, double entr){

        try
            {                
                Statement st = EKoneksi.getConnection().createStatement();
                st.executeUpdate("INSERT INTO images (klasifikasi,mean,standard_deviasi,entropy) "
                        + "VALUES ('"+klsf+"','"+mean+"','"+sd+"','"+entr+"')");
                        JOptionPane.showMessageDialog(null,"Data Sukses Dimasukkan");
                    }catch (SQLException e)
                    {
                        JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan," + e.toString());
                    }
    }
     
    public void InsertNewClassification(String name){

        try
            {                
                Statement st = EKoneksi.getConnection().createStatement();
                st.executeUpdate("INSERT INTO klasifikasi "
                        + "VALUES ('"+name+"')");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan," + e.toString());
        }
    }
    
    public int getLastImgIncrement(){
        int result = 0;
        try
        {
            Statement S = c.getConnection().createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM images ORDER BY img_url DESC");
            R.first();
            result = Integer.parseInt(R.getString("img_url"));
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }

    public void UpdateClassification(String old, String name) {
        try
        {                
            Statement st = EKoneksi.getConnection().createStatement();
            st.executeUpdate("UPDATE klasifikasi SET nama_klasifikasi='"
                    + name + "' WHERE nama_klasifikasi='" + old + "'");
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan," + e.toString());
        }
    }
}

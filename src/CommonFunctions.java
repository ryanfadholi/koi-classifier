
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class CommonFunctions {
    public static String img_dir = "C:\\ProgramData\\Koi-Classifier\\Images\\";
    public static CKlasifikasi ck = new CKlasifikasi();
    
    public static String browseImage_string(){
        JFileChooser browser = new JFileChooser();
        FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Image file","bmp","jpg","png");
        browser.setFileFilter(textFilter);
        browser.setSelectedFile(null);
        
        int isset = browser.showOpenDialog(null);
        
        if(isset == browser.APPROVE_OPTION) {
            String file = browser.getSelectedFile().toString();
            System.out.println(file);
            return file;
        }
        
        return "ERROR";
    }
    
    public static BufferedImage browseImage_bufferedImage(){
        return getBufferedImage(browseImage_string());
    }
    
    public static BufferedImage getBufferedImage(String dir){
        BufferedImage result = null;
        try{
            result = ImageIO.read(new File(dir));
        } catch(IOException e){
            System.out.println("Read Error!");
            return null;
        }
        return result;
    }
    
    public static File getImageDir(String imageName){
        return new File(CommonFunctions.img_dir + "/" + imageName + ".png");
    }
    
    public static ImageIcon getIconInstance(BufferedImage img){
        return new ImageIcon(img);
    }
    
    public static ImageIcon getIconInstance(BufferedImage img, int width, int height){
        return new ImageIcon(
                img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
    
    public static int getNewImageID(){
        return ck.getLastImgIncrement();
    }
    
    public static void saveImage(BufferedImage img, String klasifikasi){
        ck.InsertNewImage(klasifikasi, 0.5, 0.5, 0.5);
    }
    
    public static void saveImage(ArrayList<Double> values, String klasifikasi){
        ck.InsertNewImage(klasifikasi, values.get(0), values.get(1), values.get(2));
    }
    
    public static int ConfirmationDialog(String message){
        return JOptionPane.showConfirmDialog(null, message, "Confirm", JOptionPane.YES_NO_OPTION);
    }
   
    public static ArrayList<Double> extractImage(BufferedImage source){
        ArrayList<Double> result = new ArrayList<>();
        
        //Hitung mean
        result.add(calculateMean(source));
        
        //Hitung standar deviasi
        result.add(calculateStandardDeviation(source));
        
        //Hitung entropi
        result.add(calculateEntropy(source));
        
        return result;
    }

    static double calculateEuclid(DataCitra dataQuery, DataCitra data) {
        return sqrt(pow(data.getMean() - dataQuery.getMean(),2)
                    +pow(data.getStandard_deviation() - dataQuery.getStandard_deviation(),2)
                    +pow(data.getEntropy() - dataQuery.getEntropy(),2));
    }
    
    public static double calculateMean(BufferedImage image){
        Raster raster = image.getRaster();
        double sum = 0.0;
        
        for (int y = 0; y < image.getHeight(); ++y){
          for (int x = 0; x < image.getWidth(); ++x){
            sum += (raster.getSample(x, y, 0) +
                   raster.getSample(x, y, 1) +
                   raster.getSample(x, y, 2))/3;
          }
        }

        return sum / (image.getWidth() * image.getHeight()); 
    }
    
    
    
    public static double calculateEntropy(BufferedImage actualImage){
        ArrayList<String> values= new ArrayList<String>();
        int n = 0;
        Map<Integer, Integer> occ = new HashMap<>();
        
        for(int i=0;i<actualImage.getHeight();i++){
            for(int j=0;j<actualImage.getWidth();j++){
                //do some fucking magic
                int pixel = actualImage.getRGB(j, i);
                int alpha = (pixel >> 24) & 0xff;
                int red = (pixel >> 16) & 0xff;
                int green = (pixel >> 8) & 0xff;
                int blue = (pixel) & 0xff;
  
                int d= (int)Math.round(0.2989 * red + 0.5870 * green + 0.1140 * blue);
                if(!values.contains(String.valueOf(d)))
                    values.add(String.valueOf(d));
                if (occ.containsKey(d)) {
                    occ.put(d, occ.get(d) + 1);
                } else {
                    occ.put(d, 1);
                }
                ++n;
           }
        }
        
        double e = 0;
        
        for (Map.Entry<Integer, Integer> entry : occ.entrySet()) {
             int cx = entry.getKey();
             double p = (double) entry.getValue() / n;
             e += p * CommonFunctions.log2(p);
        }
        return -e;
    }

    public static double logb( double a, double b )
    {
        return Math.log(a) / Math.log(b);
    }

    public static double log2( double a )
    {
        return logb(a,2);
    }

    public static double calculateStandardDeviation(BufferedImage img){
      
       double variance = calculateVariance(img);
       return  Math.sqrt(variance);      
    }
    
    public static double calculateVariance(BufferedImage img){
         double mean = calculateMean(img);
         double size = (img.getHeight() * img.getWidth());
         
         Raster raster = img.getRaster();
         double sum = 0.0;

           for (int y = 0; y < img.getHeight(); ++y){
             for (int x = 0; x < img.getWidth(); ++x){
                sum += pow(((raster.getSample(x, y, 0) +
                      raster.getSample(x, y, 1) +
                      raster.getSample(x, y, 2))/3)-mean,2);
             }
           }
           
           return sum/size;
         
    }
    
    
    
    
}

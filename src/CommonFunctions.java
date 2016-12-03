
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
    
    public static ImageIcon getIconInstance(BufferedImage img){
        return new ImageIcon(img);
    }
    
    public static ImageIcon getIconInstance(BufferedImage img, int width, int height){
        return new ImageIcon(
                img.getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }
}

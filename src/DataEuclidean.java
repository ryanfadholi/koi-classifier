/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class DataEuclidean {
    private String ImageID;
    private String klasifikasi;
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    public String getImageID() {
        return ImageID;
    }

    public double getValue() {
        return value;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    
    public DataEuclidean(String ImageID, String klasifikasi, double value) {
        this.ImageID = ImageID;
        this.klasifikasi = klasifikasi;
        this.value = value;
    }
    
    
}

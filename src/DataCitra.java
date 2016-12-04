/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan Fadholi
 */
public class DataCitra {
    private String ImageID;
    private String klasifikasi;
    private double mean;
    private double standard_deviation;
    private double entropy;

    public DataCitra(String ImageID, String klasifikasi) {
        this.ImageID = ImageID;
        this.klasifikasi = klasifikasi;
    }

    public DataCitra(String ImageID, String klasifikasi, double mean, double standard_deviation, double entropy) {
        this.ImageID = ImageID;
        this.klasifikasi = klasifikasi;
        this.mean = mean;
        this.standard_deviation = standard_deviation;
        this.entropy = entropy;
    }
    
    public DataCitra(double mean, double standard_deviation, double entropy) {
        this.ImageID = "Query";
        this.mean = mean;
        this.standard_deviation = standard_deviation;
        this.entropy = entropy;
    }

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public double getStandard_deviation() {
        return standard_deviation;
    }

    public void setStandard_deviation(double standard_deviation) {
        this.standard_deviation = standard_deviation;
    }

    public double getEntropy() {
        return entropy;
    }

    public void setEntropy(double entropy) {
        this.entropy = entropy;
    }

    public String getImageID() {
        return ImageID;
    }
    
    
}

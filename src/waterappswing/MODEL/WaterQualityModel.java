/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterappswing.MODEL;

/**
 *
 * @author Marie Noela Abuin
 */
public class WaterQualityModel extends WaterSourceModel {

    private double pHLevel;
    private String contaminant;
    private String quality;

    public WaterQualityModel(String contaminant, String quality, double pHLevel) {
        super(contaminant, quality); 
        this.pHLevel = pHLevel;
        this.contaminant = contaminant;
        this.quality = quality;
    }

    public double getpHLevel() {
        return pHLevel;
    }

    public String getContaminant() {
        return contaminant;
    }

    public String getQualityGrade() {
        return quality;
    }

    @Override
    public String toString() {
        return "Contaminant: " + contaminant
                + "\n Quality : " + quality
                + "\npH Level: " + pHLevel;
    }

}

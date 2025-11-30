/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterappswing.MODEL;

/**
 *
 * @author Marie Noela Abuin
 */
public class WaterSourceModel extends Report {

    private String name;
    private String location;

    // Constructor
    public WaterSourceModel(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayInfo() {
        System.out.println("Water Source: " + name + " | Location: " + location);

    }

    @Override
    public String getReportDetails() {
        return "Water Source: " + name + "\nLocation: " + location;
    }

}

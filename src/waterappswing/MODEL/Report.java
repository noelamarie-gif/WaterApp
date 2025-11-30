/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterappswing.MODEL;

/**
 *
 * @author Marie Noela Abuin
 */
public class Report {

    private int reportId;
    private String reportDate;

    public Report() {
        this.reportId = 0;
        this.reportDate = "N/A";
    }

    public Report(int reportId, String reportDate) {
        this.reportId = reportId;
        this.reportDate = reportDate;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReportDetails() {
        return "Generic Report";
    }

    public void displayReport() {
        System.out.println("Report ID: " + reportId + " | Date: " + reportDate);
    }

}

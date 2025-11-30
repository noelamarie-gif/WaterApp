/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterappswing.MODEL;

/**
 *
 * @author Marie Noela Abuin
 */
public class ReportModel extends Report {

    private String title;
    private String details;
    private ReportType type;

    public ReportModel(String title, String details, ReportType type) {
        this.title = title;
        this.details = details;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public ReportType getType() {
        return type;
    }

    @Override
    public String getReportDetails() {
        return "Report Title: " + title
                + "\nDetails: " + details
                + "\nType: " + type;
    }

}

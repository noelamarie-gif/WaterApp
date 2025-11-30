/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waterappswing.MODEL;

/**
 *
 * @author Marie Noela Abuin
 */
public class EducationModel extends Report {
    private String topic;
    private String author;

    public EducationModel(String topic, String author) {
        this.topic = topic;
        this.author = author;
    }

    @Override
    public String getReportDetails() {
        return "Education Report\nTopic: " + topic + "\nAuthor: " + author;
    }

    
}

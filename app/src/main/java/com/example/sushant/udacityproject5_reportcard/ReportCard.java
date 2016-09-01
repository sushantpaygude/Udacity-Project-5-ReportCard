package com.example.sushant.udacityproject5_reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ReportCard  {


    private String readingGrade;
    private String writingGrade;
    private String mathGrade;
    private String artGrade;
    private String finalGrade;

    public ReportCard( String readingGrade, String writingGrade, String mathGrade, String artGrade, String finalGrade) {

        this.readingGrade = readingGrade;
        this.writingGrade = writingGrade;
        this.mathGrade = mathGrade;
        this.artGrade = artGrade;
        this.finalGrade = finalGrade;
    }



    public String getReadingGrade() {
        return readingGrade;
    }

    public String getWritingGrade() {
        return writingGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public String getArtGrade() {
        return artGrade;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setWritingGrade(String writingGrade) {
        this.writingGrade = writingGrade;
    }

    public void setReadingGrade(String readingGrade) {
        this.readingGrade = readingGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setArtGrade(String artGrade) {
        this.artGrade = artGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "readingGrade='" + readingGrade + '\'' +
                ", writingGrade='" + writingGrade + '\'' +
                ", mathGrade='" + mathGrade + '\'' +
                ", artGrade='" + artGrade + '\'' +
                ", finalGrade='" + finalGrade + '\'' +
                '}';
    }
}

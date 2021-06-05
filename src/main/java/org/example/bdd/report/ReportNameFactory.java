package org.example.bdd.report;

public class ReportNameFactory {
    public static Report getReport(ReportTypes reportTypes) {
        switch (reportTypes) {
            case RADIO:
                return new RadiologyReport();
            case CARDIO:
                return new CardioReport();
            default:
                throw new IllegalArgumentException("no object found for this report " + reportTypes.name());
        }
    }
}

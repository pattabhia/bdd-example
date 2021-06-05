package org.example.bdd.report;

public class ReportServiceFactory {

    public static ReportService getReportService(ReportTypes reportTypes) {
        switch (reportTypes) {
            case RADIO:
                return new RadioReportServiceClass();
            case CARDIO:
                return new CardioReportService();
            default:
                throw new IllegalArgumentException("no object found for this reportType " + reportTypes.name());
        }
    }
}

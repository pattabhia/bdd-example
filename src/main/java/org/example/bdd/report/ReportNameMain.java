package org.example.bdd.report;

import static org.example.bdd.report.ReportNameFactory.getReport;
import static org.example.bdd.report.ReportServiceFactory.getReportService;
import static org.example.bdd.report.ReportTypes.*;

public class ReportNameMain {

    public static void main(String[] args) {
        Report report = getReport(RADIO);
        System.out.println(report.getOutputPath());
        System.out.println(report.getFormat());

        final ReportService reportService = getReportService(RADIO);
        System.out.println(reportService.name());
    }
}

package org.example.bdd.report;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CardioReport extends Report {

    @Override
    public String getName() {
        return "CardioRep";
    }

    @Override
    public String getFormat() {
        return "csv";
    }

    @Override
    public Path getOutputPath() {
        return Paths.get(basePath(), "Cardio");
    }
}

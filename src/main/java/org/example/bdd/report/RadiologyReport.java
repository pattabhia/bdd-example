package org.example.bdd.report;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RadiologyReport extends Report {

    @Override
    public String getName() {
        return "RadiologyRep";
    }

    @Override
    public String getFormat() {
        return "xml";
    }

    @Override
    public Path getOutputPath() {
        return Paths.get(basePath(), "Radio");
    }
}

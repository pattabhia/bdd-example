package org.example.bdd.report;

import lombok.Getter;

import java.io.Serializable;
import java.nio.file.Path;

@Getter
public class Report implements Serializable,WithBasePath {
    private String name;
    private String type;
    private String format;
    private Path outputPath;

    @Override
    public String basePath() {
        return "D:/REPORTS";
    }
}

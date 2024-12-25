package org.training.sqills.pattern.structural.composite;

import java.util.Iterator;
import java.util.List;

public abstract class AbstractFile implements Iterable<AbstractFile>{
    List<AbstractFile> abstractFiles;
    private String fileName;
    private final EFileType fileType;

    public AbstractFile(final String fileNameParam,
                        final EFileType fileTypeParam) {
        fileName = fileNameParam;
        fileType = fileTypeParam;
    }

    public abstract AbstractFile add(AbstractFile abstractFileParam);

    public abstract String print();

    public String getFileName() {
        return fileName;
    }

    public void rename(final String fileNameParam) {
        fileName = fileNameParam;
    }

    public EFileType getFileType() {
        return fileType;
    }

}

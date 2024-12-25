package org.training.sqills.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class File extends AbstractFile {
    public File(final String fileNameParam) {
        super(fileNameParam,
              EFileType.DIR);
    }

    public AbstractFile add(AbstractFile abstractFileParam) {
        throw new IllegalStateException("Fie a file eklenmez");
    }

    @Override
    public String print() {
        return "File : " + getFileName();
    }


    @Override
    public Iterator<AbstractFile> iterator() {
        throw new IllegalStateException("File iterator barındırmaz");
    }


}

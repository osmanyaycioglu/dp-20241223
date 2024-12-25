package org.training.sqills.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Folder extends AbstractFile {
    public Folder(final String fileNameParam) {
        super(fileNameParam,
              EFileType.DIR);
    }

    public AbstractFile add(AbstractFile abstractFileParam) {
        if (abstractFiles == null) {
            abstractFiles = new ArrayList<>();
        }
        abstractFiles.add(abstractFileParam);
        return this;
    }

    @Override
    public String print() {
        StringBuilder builderLoc = new StringBuilder(50);
        builderLoc.append("- Dir : ")
                  .append(getFileName())
                  .append("[");
        for (AbstractFile abstractFileLoc : this) {
            builderLoc.append(abstractFileLoc.print());
            builderLoc.append(",");
        }
        builderLoc.append("] - ");
        return builderLoc.toString();
    }


    @Override
    public Iterator<AbstractFile> iterator() {
        return abstractFiles.iterator();
    }
}

package org.training.sqills.pattern.structural.composite;

public class FileMain {
    public static void main(String[] args) {
        Folder       root       = (Folder) EFileType.DIR.getInstance("root");
        AbstractFile subDir2Loc = EFileType.DIR.getInstance("subDir2")
                                               .add(EFileType.FILE.getInstance("file4.txt"));
        root.add(EFileType.FILE.getInstance("file1.txt"));
        root.add(EFileType.DIR.getInstance("subDir")
                              .add(EFileType.FILE.getInstance("file2.txt"))
                              .add(EFileType.FILE.getInstance("file3.txt"))
                              .add(subDir2Loc));
        System.out.println(root.print());
    }
}

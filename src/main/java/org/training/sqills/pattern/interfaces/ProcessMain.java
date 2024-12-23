package org.training.sqills.pattern.interfaces;

import java.util.List;

public class ProcessMain {
    public static void main(String[] args) {
        int a = 100;

        IProcess processLoc = new IProcess() {
            @Override
            public String execute(final String ruleName) {
                return "executing : " + ruleName + " " + a;
            }
        };

        System.out.println(processLoc.execute("rule1"));

        IProcess processLoc2 = r -> "executing : " + r + " " + a;

        IProcessEx iProcessExLoc = (a1, b1) -> "exec : " + a1 + " value : " + b1;

        IProcess    processLoc3    = ProcessMain::methodXyz;
        ProcessMain processMainLoc = new ProcessMain();
        IProcess    processLoc4    = processMainLoc::methodAbc;

        processLoc4.execute("osman");

        IProcess processLoc5 = a2 -> {
            System.out.println("before exec");
            return "Multi line exec : " + a2;
        };

        List<String> myList = List.of("osman", "ali","veli");
        for (String sLoc : myList) {
            System.out.println("deneme : " + sLoc);
        }

        myList.forEach(s -> System.out.println("deneme : " + s));
    }

    public static String methodXyz(String stringParam) {
        return "Method binding : " + stringParam;
    }

    public String methodAbc(String stringParam) {
        return "Method binding : " + stringParam;
    }

}

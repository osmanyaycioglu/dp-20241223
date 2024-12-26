package org.training.sqills.pattern.structural.decorator;

public class BigPizza extends Pizza{

    public Integer getPrice() {
        return 270;
    }

    public String getDescription(){
        return "Büyük Pizza";
    }

}

package org.training.sqills.pattern.behavioral.visitor;


public class Mouse implements ComputerPart{

    private int x = 10;
    private int y = 20;


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }

    public int getX() {
        return x;
    }

    public void setX(final int xParam) {
        x = xParam;
    }

    public int getY() {
        return y;
    }

    public void setY(final int yParam) {
        y = yParam;
    }
}

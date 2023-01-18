package dmit2015.model;

public class Rectangle {
    private double theLength;
    private double width;

    public double getLength() {
        return theLength;
    }

    public void setLength(double length) {
        this.theLength = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
    }

    public Rectangle(double theLength, double width) {
        this.theLength = theLength;
        this.width = width;
    }
    public double area(){
        return width * theLength;
    }

}

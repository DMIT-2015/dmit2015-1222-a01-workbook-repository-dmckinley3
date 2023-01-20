package dmit2015.model;

import lombok.Data;

/**
 * This class models a rectangle shape
 *
 * @author David
 * @version 2023.01.20
 **/
@Data
public class Rectangle {
    /**
     * The length of this Rectangle
     **/
    private double length;
    /**
     * The width of this Rectangle
     **/
    private double width;

    /**
     * Compute and return the area of this rectangle
     *
     * @return area of this circle
     **/
    public double area() {
        return width * length;
    }

    /**
     * Compute and return the perimeter of this rectangle
     *
     * @return perimeter of this circle
     **/
    public double perimeter() {
        return 2 * (length + width);
    }

    /**
     * Compute and return the diagonal of this rectangle
     *
     * @return diagonal of this circle
     **/
    public double diagonal() {
        return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
    }

}

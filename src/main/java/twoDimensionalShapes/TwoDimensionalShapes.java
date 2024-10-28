// Goal of this class: This class is the parent class for 'Rectangle' and 'Triangle'
// It contains:
// 1. The class twoDimensional shapes + constructors + getters & setters
// 2. Two abstract methods; 'getArea.' and 'getPerimeter'
// Rectangle and Triangle have different ways to calculate their Area and Perimeter,
// so they will override both abstract methods.

package twoDimensionalShapes;

abstract public class TwoDimensionalShapes {
    private double length;
    private double width;

    public TwoDimensionalShapes(double length, double width){
        this.length = length;
        this.width = width;
    }

    abstract public double getArea();

    abstract public double getPerimeter();

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

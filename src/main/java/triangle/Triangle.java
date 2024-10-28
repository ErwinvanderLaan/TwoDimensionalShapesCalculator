// Goal of this class: Triangle is an extension of the 'twoDimensionalShapes' Class.
// It defines the Triangle object.
// It contains:
// 1. The Triangle class + constructor.
// 2. The calculation to get the area of the Triangle
// 3. The calculation to get the perimeter of the Triangle.

package triangle;

import twoDimensionalShapes.TwoDimensionalShapes;

public class Triangle extends TwoDimensionalShapes {

    public Triangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea(){
        return getLength() * getWidth() / 2;
    }

    @Override
    public double getPerimeter(){
        return getLength() + getLength() + getWidth();
    }

}

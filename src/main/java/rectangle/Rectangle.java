// Goal of this class: Rectangle is an extension of the 'twoDimensionalShapes' Class.
// It defines the Rectangle object.
// It contains:
// 1. The Rectangle class + constructor.
// 2. The calculation to get the area of the rectangle
// 3. The calculation to get the perimeter of the rectangle.

package rectangle;

import twoDimensionalShapes.TwoDimensionalShapes;

public class Rectangle extends TwoDimensionalShapes {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getArea(){
        return getLength() * getWidth();
}

    @Override
    public double getPerimeter(){
      return 2 * ( getLength() + getWidth() );
    }

}

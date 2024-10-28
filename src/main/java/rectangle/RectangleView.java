// Goal of this class: This class determines how the data is displayed to the user.
// It contains the printRectangleCalculations method to print the length, width, area and perimeter
// of a rectangle.

package rectangle;

public class RectangleView {

    public void printRectangleCalculations(
            double rectangleLength, double rectangleWidth,
            double rectangleArea, double rectanglePerimeter) {
        System.out.println("Rectangle: ");
        System.out.println("Length: " + rectangleLength);
        System.out.println("Width: " + rectangleWidth);
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);
    }
}

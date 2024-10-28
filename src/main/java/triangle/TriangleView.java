// Goal of this class: This class determines how the data is displayed to the user.
// It contains the 'printTriangleCalculations', method to print the length, width, area and perimeter
// of a triangle.

package triangle;

public class TriangleView {

    public void printTriangleCalculations(
            double triangleLength, double triangleWidth,
            double triangleArea, double trianglePerimeter) {
        System.out.println("Triangle: ");
        System.out.println("Length: " + triangleLength);
        System.out.println("Width: " + triangleWidth);
        System.out.println("Area: " + triangleArea);
        System.out.println("Perimeter: " + trianglePerimeter);
    }
}

// Goal of this class: The main class starts the program.
// It contains:
// 1. A scanner object to process user input.
// 2. A switch to allow a user to choose between a Rectangle or a Triangle.
// 3. The methods to create a Rectangle or a Triangle + an instantiation of each.

package main;

import rectangle.Rectangle;
import rectangle.RectangleController;
import rectangle.RectangleView;

import triangle.Triangle;
import triangle.TriangleController;
import triangle.TriangleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Rectangle rectangleModel = retrieveRectangleFromRepository();
        RectangleView rectangleView = new RectangleView();
        RectangleController rectangleController = new RectangleController(rectangleModel, rectangleView);

        Triangle triangleModel = retrieveTriangleFromRepository();
        TriangleView triangleView = new TriangleView();
        TriangleController triangleController = new TriangleController(triangleModel, triangleView);

        System.out.println(""" 
                Choose an two-dimensional shape to calculate with:
                Press '1' to work with rectangles.
                Press '2' to work with triangles.
                Press '3' to quit.
                """);

        int choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.print("Enter the length of the rectangle: ");
                rectangleController.setRectangleLength(scanner.nextDouble());
                System.out.print("Enter the width of the rectangle: ");
                rectangleController.setRectangleWidth(scanner.nextDouble());
                rectangleController.updateView();
                break;
            case 2:
                System.out.print("Enter the length of the triangle: ");
                triangleController.setTriangleLength(scanner.nextDouble());
                System.out.print("Enter the width of the triangle: ");
                triangleController.setTriangleWidth(scanner.nextDouble());
                triangleController.updateView();
            case 3:
                System.out.println("Quiting");
                break;
            default:
                System.out.println("Choice not recognized. Please try again");
        }

    }

    private static Rectangle retrieveRectangleFromRepository(){
        Rectangle rectangle = new Rectangle(0,0);
        rectangle.setLength(0);
        rectangle.setWidth(0);
        return rectangle;
    }

    private static Triangle retrieveTriangleFromRepository() {
        Triangle triangle = new Triangle(0, 0);
        triangle.setLength(0);
        triangle.setWidth(0);
        return triangle;
    }
}
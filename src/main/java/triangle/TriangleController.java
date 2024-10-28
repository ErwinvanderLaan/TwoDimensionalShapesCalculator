// Goal of this class: This class Acts as an intermediary between Triangle and 'Triangleview.'
// It Contains:
// 1. Methods to update 'Rectangle', for example 'setRectangleLength' and 'setRectangleWidth.'
// 2. A method to update 'RectangleView' (updateRectangleView).

package triangle;

public class TriangleController {
    private Triangle model;
    private TriangleView view;

    public TriangleController (Triangle model, TriangleView view){
        this.model = model;
        this.view = view;
    }

    public double getTriangleLength(){
        return model.getLength();
    }

    public double getTriangleWidth(){
        return model.getWidth();
    }

    public double getTriangleArea(){
        return model.getArea();
    }

    public double getTrianglePerimeter() {
        return model.getPerimeter();
    }

    public void setTriangleLength(double length){
        model.setLength(length);
    }

    public void setTriangleWidth(double width){
        model.setWidth(width);
    }

    public void updateView(){
        view.printTriangleCalculations( getTriangleLength(), getTriangleWidth(),
                getTriangleArea(),getTrianglePerimeter() );
    }

}

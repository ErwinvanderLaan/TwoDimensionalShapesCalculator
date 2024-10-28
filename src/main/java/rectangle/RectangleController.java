// Goal of this class: This class Acts as an intermediary between Rectangle and Rectangleview.
// It Contains:
// 1. Methods to update 'Rectangle', for example 'setRectangleLength' and 'setRectangleWidth.'
// 2. A method to update 'RectangleView' (updateRectangleView).

package rectangle;

public class RectangleController {
    private Rectangle model;
    private RectangleView view;

    public RectangleController( Rectangle model, RectangleView view){
        this.model = model;
        this.view = view;
    }

    public double getRectangleLength (){
        return model.getLength();
    }

    public double getRectangleWidth(){
        return model.getWidth();
    }

    public double getRectangleArea(){
        return model.getArea();
    }

    public double getRectanglePerimeter() {
        return model.getPerimeter();
    }

    public void setRectangleLength(double length){
        model.setLength(length);
    }

    public void setRectangleWidth(double width){
        model.setWidth(width);
    }

    public void updateView(){
        view.printRectangleCalculations(getRectangleLength(), getRectangleWidth(),
                getRectangleArea(),getRectanglePerimeter());
    }
}

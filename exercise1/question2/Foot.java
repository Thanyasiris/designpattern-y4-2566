import java.util.Scanner;

public class Foot {
    /**
     * @param args the command line arguments
     */
    private FootShape footShape;

    public Foot(FootShape footShape) {
        this.footShape = footShape;
    }

    public void draw(String shape) {
        switch (shape) {
            case "Ellipse":
                footShape.drawAsEllipse();
                break;
            case "Rectangle":
                footShape.drawAsRectangle();
                break;
            default:
                break;
        }
    }
}

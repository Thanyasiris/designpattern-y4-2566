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

    public static void main(String[] args) {
        FootShape footShape = new FootShape();
        String shape = null;
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = inp.nextInt();
        switch (type) {
            case 1:
                shape = "Ellipse";
                break;
            case 2:
                shape = "Rectangle";
                break;
            default:
                break;
        }
        Foot foot = new Foot(footShape);
        foot.draw(shape);
    }
}

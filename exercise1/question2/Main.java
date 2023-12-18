import java.util.Scanner;

public class Main {

    public static String getFootShapeFromUser() {
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
        inp.close();
        return shape;
    }

    public static void main(String[] args) {
        FootShape footShape = new FootShape();
        Foot foot = new Foot(footShape);
        String shape = getFootShapeFromUser();
        foot.draw(shape);
    }
}

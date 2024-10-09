import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String trash = "";
        String trashTwo = "";
        double height = 0.0;
        double hSquared = 0.0;
        double width = 0.0;
        double wSquared = 0.0;
        double calculation = 0.0; //This is a variable to help with calculation
        double crossLength = 0.0;
        double area = 0.0;
        double perim = 0.0;
        boolean valid = true;

        do {
            do {
                System.out.print("input a value for the height of the rectangle here: ");
                if (in.hasNextDouble()) {

                    height = in.nextDouble();
                    hSquared = Math.pow(height, 2);
                    valid = true;
                } else if (in.hasNext()) {

                    trash = in.next();
                    valid = false;
                    System.out.println("Your input for the height of the rectangle, " + trash + ", was invalid, please use an integer or decimal.");

                }
            } while (!valid);
            do {
                System.out.print("input a value for the width of the rectangle here: ");
                if (in.hasNextDouble()) {

                    width = in.nextDouble();
                    wSquared = Math.pow(width, 2);
                    valid = true;
                } else if (in.hasNext()) {

                    trashTwo = in.next();
                    valid = false;
                    System.out.println("Your input for the width of the rectangle, " + trashTwo + ", was invalid, please use an integer or decimal.");

                }

                perim = (2 * height) + (2 * width);
                area = width * height;
                calculation = wSquared + hSquared;
                crossLength = Math.sqrt(calculation);
            } while (!valid);
            System.out.println("The perimeter of your rectangle is " + perim);
            System.out.println("The area of your rectangle is " + area);
            System.out.println("The length of the diagonal going through the rectangle corner to corner is " + crossLength);
        } while (!valid);
    }
}

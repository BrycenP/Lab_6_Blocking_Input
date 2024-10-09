import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String trash = "";
        double celsius;
        double calculation = 0.0; //This variable just makes it easier to do calculations that take multiple steps
        double ctoF = 0;

        System.out.print("Please input your temperature in Celsius here: ");

        if (in.hasNextDouble()){
            celsius = in.nextDouble();
            ctoF = celsius * 9;
            calculation = ctoF / 5;
            ctoF = calculation + 32;
            System.out.println("your temperature in Fahrenheit from Celsius is: " + ctoF);
        }
        else if (in.hasNext()){
            trash = in.next();
            System.out.println("Your input " + trash + " was invalid, please input a temperature as an integer or decimal.");
        }
    }
}
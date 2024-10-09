import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args)
    {
        double gallons = 0.0;
        double milesPerGallon = 0.0;
        double gasCost = 0.0;
        double fullTankDrive = 0.0;
        double drive = 0.0;
        double hundredMileCost;
        boolean doneMPG = false;
        boolean doneGallons = false;
        boolean doneCost = false;

        Scanner input = new Scanner(System.in);


            do
            {
            System.out.print("What is the capacity of your fuel tank in gallons?");

                if (input.hasNextDouble()) {
                    gallons = input.nextDouble();
                    input.nextLine();
                    doneGallons = true;
                }
                else {
                    input.nextLine();
                    System.out.println("Please ender a valid input: ");
                }
            }
            while (!doneGallons) ;

            do {
                System.out.print("How many miles per gallon does your car get?");

                if (input.hasNextDouble()) {
                    milesPerGallon = input.nextDouble();
                    input.nextLine();
                    doneMPG = true;
                } else {
                    input.nextLine();
                    System.out.println("Please ender a valid input: ");
                }
            }
            while(!doneMPG);
            do
            {
                System.out.print("How much is gas per gallon?");

                if (input.hasNextDouble()) {
                    gasCost = input.nextDouble();
                    input.nextLine();
                    doneCost = true;
                }
                else {
                    input.nextLine();
                    System.out.println("Please ender a valid input: ");
                }
            }
            while(!doneCost);

                drive = 100/ milesPerGallon;
                hundredMileCost = drive * gasCost;
                System.out.println("The cost to drive 100 miles with your inputed gas price and fuel economy is $" + hundredMileCost);

                fullTankDrive = gallons * milesPerGallon;
                System.out.println("You can drive " + fullTankDrive + " miles on a full tank of gas");
    }
}



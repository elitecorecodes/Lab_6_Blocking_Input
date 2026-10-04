import java.util.Scanner;

public class FuelCosts {

    public static void main( String[] args) {

    Scanner in = new Scanner(System.in);

    //
    double gallons = 0;
    double fuelEfficiency = 0;
    double gasPrice =0;

    String trash = "";
    boolean done = false;

    do {
        System.out.print(" Enter the number of gallons in the tank: ");

    if (in.hasNextDouble()) {
        gallons = in.nextDouble();
        in.nextLine();
        done = true;

    } else {
        trash = in.nextLine();
        System.out.println("You entered " + trash + ". Please enter a valid number.");
    }


    } while (!done);
// Fuel efficiency
done = false;

do {
    System.out.print("Enter the fuel efficiency in miles per gallon: ");

    if (in.hasNextDouble()) {
        fuelEfficiency = in.nextDouble();
        in.nextLine();
        done = true;

    } else {
        trash = in.nextLine();
        System.out.println("You entered " + trash + ". Please enter a valid number.");
    }

} while (!done);
// Gas Price
    done = false;

    do {
        System.out.print("Enter the price of gas per gallon: ");

        if (in.hasNextDouble()) {
            gasPrice = in.nextDouble();
            in.nextLine();
            done = true;


        } else {
            trash = in.nextLine();
            System.out.println("You entered " + trash + ". Please enter a valid number.");

        }

    } while (!done);
    double costPer100Miles;
    double fullTankDistance;

    costPer100Miles = (100/ fuelEfficiency) * gasPrice;
    fullTankDistance = gallons * fuelEfficiency;

    System.out.println("Cost to drive 100 miles: $" + costPer100Miles);
    System.out.println("Distance on a full tank: " + fullTankDistance + " miles");


    }


    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String Trash = "";

        double meter = 0;

        System.out.print("\n Enter the length in meters: ");
        if(in.hasNextDouble()) {
           meter  = in.nextDouble();
        }
        else {
            Trash = in.nextLine();
            System.out.println("Error, please enter a number: ");
        }

        System.out.println("Inches: " + (meter* 39.37));
        System.out.println("Feet: " + (meter * 3.28));
        System.out.println("Miles: " + (meter * 0.000621371));


    }
}
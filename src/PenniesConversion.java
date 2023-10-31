import java.util.Scanner;
public class PenniesConversion {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int pennies;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int leftPennies;

        System.out.println("How many pennies do you have in your piggy bank?");
        pennies = keyboard.nextInt();

        dollars = pennies / 100;
        leftPennies = pennies % 100;

        quarters = leftPennies / 25;
        leftPennies = pennies % 25;

        dimes = leftPennies / 10;
        leftPennies = pennies % 10;

        nickels = leftPennies / 5;
        leftPennies = pennies % 5;

        System.out.println("Pennies entered: " + pennies);
        System.out.println("which is equal to " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes " + nickels + " nickels and " + leftPennies + " pennies");





    }
}

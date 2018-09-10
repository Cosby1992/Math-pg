import java.util.Scanner;


public class Main {

    public static void main(String[] args)

    {
        System.out.println("Please enter what i can help you with below." +
                            "\nEnter \"S\" for square" +
                            "\nEnter \"T\" for triangle");

        Scanner scankey = new Scanner(System.in);

        String key = scankey.nextLine();

        if (key.equals("S"))
            {
                System.out.println("Crazy");
            }

        else if (key.equals("T"))
            {
                System.out.println("Crazy, but with a capital T");
            }

        else
            {
                System.out.println("Input not recognized, try again. Make sure to write capital " +
                                    "letters from the list at the top only.");
            }
    }


}

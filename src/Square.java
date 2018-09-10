import java.util.Scanner;


public class Square {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Below you\'ll need to insert length and width of a square" +

                "\n\nInsert length:");

        double length = scan.nextDouble();

        System.out.println("\nInsert width:");

        double width = scan.nextDouble();

        double areal = length * width;

        double omkreds = 2 * length + 2 * width;

        System.out.println("\nFor a square with length = " + length + " and with width = " + width + "\n\n" +
                            "The area is: " + areal + "\nThe Circumfrence is: " + omkreds);

    }



}


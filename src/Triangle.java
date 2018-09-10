import java.util.Scanner;

public class Triangle

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Below you\'ll need to insert Width and height of a triangle" +

                "\n\nInsert width:");

        double width = scan.nextDouble();

        System.out.println("\nInsert height:");

        double height = scan.nextDouble();

        double areal = (height * width) / 2;



        System.out.println("\nFor a triangle with width = " + width + " and with height = " + height + "\n\n" +
                "The area is: " + areal);

    }
}

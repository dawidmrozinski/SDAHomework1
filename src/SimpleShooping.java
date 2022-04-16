import java.util.Locale;
import java.util.Scanner;

public class SimpleShooping {

    public static void main(String[] args) {

        /*
        Exercise 1- Inside a while loop (e.g. 10 times) download the product to buy and display it on the screen in
        characters: "I added <name> to cart, this is our <iteration number> product!"
        */

        Scanner in = new Scanner(System.in);
        String product;
        int numberOfProduct = 1;
        System.out.println("Welcome in Online Shop!");

        while (numberOfProduct <= 10) {
            System.out.println("What do You want to buy?");
            product = in.next();
            System.out.println("I added " + product.toUpperCase() + ", this is our " + numberOfProduct + " product!");
            numberOfProduct++;
        }
        System.out.println("Thanks for shoping, prepare Your money!");

        /*
        Exercise 2- Create a while loop that will do 5 iterations. Inside the loop, pull any from the console
        value of type int. After exiting the loop, return the sum of these values.
        */

        int iteration = 1;
        int enterNumber;
        int sum = 0;

        System.out.println("Hi! I want to sum up five numbers for you.");
        while (iteration <= 5) {
            System.out.println("Please enter " + iteration + " number!");
            enterNumber = in.nextInt();
            sum += enterNumber;
            iteration++;
        }
        System.out.println("The addition result = " + sum);

        /*
        Exercise 3- As above, but only return the sum of values that were greater than 10;
         */

        int secondIterration = 1;
        int yourNumber;
        int secondSum = 0;
        int secondSumAbove10 = 0;
        int secondSumBelow10 = 0;
        System.out.println("Second test!");
        while (secondIterration <= 5){
            System.out.println("Please enter " + secondIterration + " number!");
            yourNumber = in.nextInt();
            if(yourNumber < 10){
                secondSumBelow10 += yourNumber;
            }else{
                secondSumAbove10 += yourNumber;
            }
            System.out.println("You chose: " + yourNumber + " and this is Your " +  secondIterration + " number!");
            secondSum += yourNumber;
            secondIterration++;
        }
        String yourChoose;
        System.out.println("I have three addition result:");
        System.out.println("Enter a, if You want to know the result of addition all Yours numbers!");
        System.out.println("Enter b, if You want to know the result of addition numbers below 10 only!");
        System.out.println("Enter c, if You want to know the result of addition numbers above 10!");
        System.out.println("Enter d, if You want to know all of them!");
        yourChoose = in.next();
        if(yourChoose.equals("a")){
            System.out.println("The result of addition all Yours numbers = " + secondSum);
        }else if(yourChoose.equals("b")){
            System.out.println("The result of addition numbers below 10 only = " + secondSumBelow10);
        }else if(yourChoose.equals("c")){
            System.out.println("The result of addition numbers above 10 only = " + secondSumAbove10);
        }else if(yourChoose.equals("d")){
            System.out.println("The result of addition all Yours numbers = " + secondSum);
            System.out.println("The result of addition numbers below 10 only = " + secondSumBelow10);
            System.out.println("The result of addition numbers above 10 only = " + secondSumAbove10);
        }


        /*
        Exercise 4- Download and display any string from the user until he writes
        "end".
         */

        System.out.println("Hello again!");
        String userString;
        do{
            System.out.println("Please enter your word! If you want to stop, please enter \"end\"!");
            userString = in.next();
            System.out.println("Thanks. You enter: " + userString.toUpperCase() + " on your keyboard!");
        }while(!(userString.equals("end")));

        /*
        Exercise 5- As above, with and without displaying the word "end".
         */

        System.out.println("Hello again!");
        String userString2;
        do{
            System.out.println("Please enter your word! If you want to stop, please enter \"end\"!");
            userString2 = in.next();
            if(userString2.equals("end")){

            }else {
                System.out.println("Thanks. You enter: " + userString2.toUpperCase() + " on your keyboard!");
            }
        }while(!(userString2.equals("end")));
    }
}
//importing the input packages
import java.util.Scanner;
//initiating the class
public class thisOrThat {
    public static void main(String[] args) {
//calling the scanner      
        Scanner myNumber = new Scanner(System.in); 
    System.out.println("Enter number");
        int theyNumber = myNumber.nextInt();
//using the switch for the if else statement        
        int day = theyNumber;     
        switch (day) {
        case 1:
            System.out.println("Your number is 1." );
    break;
        case 2:
            System.out.println("Your number is 2.");
    break;
        case 3:
            System.out.println("Your number is 3.");
    default:
        System.out.println("Hello, World!");
        }
    }
}
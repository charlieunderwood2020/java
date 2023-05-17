
import java.util.Scanner;

import java.lang.Math.*;

public class pyCalc {
    public static void main(String[] args) {
        Scanner newCalc1 = new Scanner(System.in);
        System.out.println("Enter side A, press Enter, then side B, then press Enter. The output will be side C.");
        Scanner newCalc2 = new Scanner(System.in);
        double sideA = newCalc1.nextInt();
        double sideB = newCalc2.nextInt();
        
        double totalCalc1 = Math.pow(sideA, 2) + Math.pow(sideB, 2);
        double totalCalc2 = Math.pow(totalCalc1, 2);
        System.out.println(totalCalc2);
    }
}

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent number: ");
        int exponent = scanner.nextInt();

        scanner.close();

        long result = calculatePower(base, exponent);
        System.out.println(base + "^" + exponent + "=" + result);
    }

    static long calculatePower(int base,int exponent) {
        if ((exponent == 0)) {

            return 1; //Any number raised to the power of 0 is 1
        }else if (exponent >0) {
            return base * calculatePower(base, exponent - 1); //Recursive calculation for positive exponent
        } else {
            return (long) 1.0 / (base * calculatePower(base,-exponent - 1)); //Calculation for negative exponent

        }
    }


}


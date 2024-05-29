import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        long sum = 0;
        int loopCount = 0;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number or character to exit: ");
            try {
                String number = scanner.nextLine();
                int validNumber = Integer.parseInt(number);
                loopCount++;
                sum += validNumber;


            } catch(NumberFormatException e) {
                break;
            }
        }

        long avg =  sum / loopCount;
        long roundedAverage = Math.round(avg);
        System.out.println("SUM = " + sum + " AVG = " + roundedAverage);
    }

}

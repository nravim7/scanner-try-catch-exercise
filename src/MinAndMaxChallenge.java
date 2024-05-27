import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {

        int currentMin = 0;
        int currentMax = 0;
        int loopCount = 0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number or any character to exit: ");
            try {
                String number = scanner.nextLine();
                int validNumber = Integer.parseInt(number);

                if (loopCount == 0 || validNumber < currentMin) {
                    currentMin = validNumber;
                }
                if (loopCount == 0 || validNumber > currentMax) {
                    currentMax = validNumber;
                }
                loopCount++;
            } catch (NumberFormatException ex) {
                System.out.println("Exiting from loop, thanks buddy!!");
                break;
            }
        }
        if (loopCount > 0) {
            System.out.println("Minimum value = " + currentMin + " and Maximum value = " + currentMax);
        } else {
            System.out.println("No valid data entered");
        }
    }
}

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        int numbers = 1;
        int sum = 0;
        do {
            System.out.println("Enter number #" + numbers);
            Scanner scanner = new Scanner(System.in);
            try {
                String number = scanner.nextLine();
                sum += Integer.parseInt(number);
                numbers++;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed, try again!!");
            }

        } while (numbers <= 5);

        System.out.println("Sum of given number = " + sum);
    }


}

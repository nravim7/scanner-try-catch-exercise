import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2024;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi, What's your name? ");
        System.out.println("Hi " + name + ", Thanks for choosing this");
        return "";

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, What's your name? ");
        //String name = System.console().readLine("Hi, What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", welcome!!");

        System.out.println("What year were you born? ");

        boolean isValidDob = false;
        int age = 0;
        do {
            System.out.println("Enter an year >= " + (currentYear - 125) + " and <= " + currentYear);
            //String dateOfBirth = scanner.nextLine();
            try {
                age = checkData(currentYear, scanner.nextLine());
                isValidDob = age < 0? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters are not allowed, try again!!!");
            }

        } while (!isValidDob);


        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;
        if ((dob < minimumYear) || (dob > currentYear)) {
            return -1;
        }
        return (currentYear - dob);
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Please input a number");
            return;
        }

        int repeatCount;
        try {
            repeatCount = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("The command-line argument must be a valid integer.");
            return;
        }
    


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite football team?: ");
        String userInput = scanner.nextLine();

        String phrase = "You like" + userInput + "!!";

        for (int i = 0; repeatCount; i++;) {
            System.out.println(phrase);
        }

        
        System.out.println("Thats a wonderful team");

    }
}
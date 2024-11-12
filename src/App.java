import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        if (args.length != 1) {
            System.out.println("Please input a number");
            return;
        }
    


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your favorite football team?: ");
        String userInput = scanner.nextLine();

        String phrase = "You like" + userInput + "!!";

    }
}
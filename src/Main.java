import java.util.Scanner;

/**
 * Created by joe on 1/3/17.
 */
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int counter = 0;

        String choice = selectionChoice();

        if(choice.equals("3")){
            System.out.println("Enter the upper bound on the sequence:");
            counter = Integer.parseInt(scanner.nextLine());
        }
        else{
            System.out.println("Enter the number of times the sequence executes:");
            counter = Integer.parseInt(scanner.nextLine());
        }

        switch (choice){
            case "1":
                FibonacciSequence.fibonacciClassic(counter);
                break;
            case "2":

                int startingValue = StartingValue();
                FibonacciSequence.fibonacciModified(startingValue, counter);
                break;
            case "3":
                FibonacciSequence.fibForLoop(counter);
                break;
            case "4":
                FibonacciSequence.fibPowerOfTwo(counter);
                break;
            case "5":
                startingValue = StartingValue();
                FibonacciSequence.fibBackwards(startingValue);
                break;
            default:
                System.out.println("pick something else");
                break;
        }
    }

    public static String selectionChoice(){

        System.out.println("Enter the fibonacci type you want");
        System.out.println("1. Classic fibonacci sequence with FizzBuzz");
        System.out.println("2. Fibonacci pattern starting from a user-chosen number \n\tand the preceding value in the sequence. Includes FizzBuzz");
        System.out.println("3. Fibonacci sequence executed with a for loop, same as the classic");
        System.out.println("4. Power of twos. Not fibonacci, just prints out 2 ^ n");
        System.out.println("5. Fibonacci backwards from a user-chosen number");
        String choice = scanner.nextLine();

        return choice;
    }

    public static Integer StartingValue(){
        System.out.println("Enter the starting value");
        int startingValue = scanner.nextInt();
        return startingValue;
    }
}

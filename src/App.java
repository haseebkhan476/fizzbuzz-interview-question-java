import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Solution No. 1
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    
        // Solution No. 2
        // if (number % 5 == 0) {
        //     if (number % 3 == 0)
        //         System.out.println("FizzBuzz");
        //     else
        //         System.out.println("Fizz");
        // }
        // else if (number % 3 == 0)
        //     System.out.println("Buzz");
        // else
        //     System.out.println(number);
    }
}

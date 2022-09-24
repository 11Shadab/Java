import java.util.Scanner;

 

public class Main {

      public static void main(String[] args) {

            int guessNumber;

            guessNumber = (int) (Math.random() * 1000);           

            Scanner keyboard = new Scanner(System.in);

            int guess;

            do {

                  System.out.print("Enter a guess (1-1000): ");

                  guess = keyboard.nextInt();

                  if (guess == guessNumber)

                        System.out.println("Your guess is correct. Congratulations!");

                  else if (guess < guessNumber)

                        System.out.println("Your guess is smaller than the secret number.");

                  else if (guess > guessNumber)

                        System.out.println("Your guess is greater than the secret number.");

            } while (guess != guessNumber);
      }

}

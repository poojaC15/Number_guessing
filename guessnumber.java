import java.util.Random;
import java.util.Scanner;
public class guessnumber{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min =1;

        int max = 100;
        int randomnumber = random.nextInt(min , max+1);
        System.out.println("Number Guessing game:");
        System.out.printf("Guess a number between %d-%d ",min, max);

        do { 
            System.out.println("Enter the guess");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomnumber){
                System.out.println("To high! try again");
            }
            else if(guess < randomnumber){
                System.out.println("Too low! try again");

            }
            else{
                System.out.println("Correct the number was "+randomnumber);
                System.out.println("number of attempts "+attempts);
            }
            
        } while (guess != randomnumber);
        System.out.println("Great you Won!!\n"+attempts);



        scanner.close();
    }
    }

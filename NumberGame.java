
import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main (String[] args){
        Scanner sc = new Scanner(System .in);
        Random random = new Random();
        int mR=1, maR=100;
        int targetNumber=random.nextInt(maR-mR+1)+mR;
        int attempts=0;
        boolean guessedCorrectly = false ;
        System.out.println("guess a number between" +mR+ "and" +maR);


        while(!guessedCorrectly){
            System.out.println("enter the guessed number:");
            int guessedNumber= sc.nextInt();
            attempts++;

            if(guessedNumber==targetNumber){
                System.out.println("Congratulations! You've guessed the correct number in" + attempts + " attempts.");
                guessedCorrectly= true;

            }else{
                System.out.println("oops!!! try again");
            }
            System.out.print("Would you like to play again?? yes/no: ");
        sc.nextLine(); 
        String playAgain = sc.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            main(null); 
        } else {
            System.out.println("Thanks for playing! Goodbye.");
        }
        sc.close();
    }



        }




    }


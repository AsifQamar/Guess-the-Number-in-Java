import java.util.Scanner;
import java.util.Random;

public class Guess_The_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Game mode\n1.Classic (Guess the number in unlimited no of guesses)\n2.Limited Guesses (Guess the number in limited no of guesses)\n(1/2)");
        int choice1 = sc.nextInt();
        if (choice1 == 1) {
            System.out.println("Select Difficulty: \n1.Easy (0 to 100)\n2.Medium (0 to 200)\n3.Hard (0 to 500)\n(1/2/3)");
            int choice = sc.nextInt();
            Random rand = new Random();
            int num = 0;
            if (choice == 1) {
                num = rand.nextInt(100);
            } else if (choice == 2) {
                num = rand.nextInt(200);
            } else if (choice == 3) {
                num = rand.nextInt(500);
            }
            int noOfGuesses = 0;
            boolean isCorrectNumber = false;
            boolean running = true;
            System.out.println("Guess the number i am thinking of");
            while (running) {
                int takeUserInput = sc.nextInt();
                if (takeUserInput == num) {
                    isCorrectNumber = true;
                } else if (takeUserInput > num) {
                    noOfGuesses++;
                    System.out.println("The number is smaller than " + takeUserInput);
                } else if (takeUserInput < num) {
                    noOfGuesses++;
                    System.out.println("The number is larger than " + takeUserInput);
                }

                if (isCorrectNumber) {
                    noOfGuesses++;
                    System.out.println("Congratulations, You Guessed the number!\nThe number was " +
                            num + " \nYou took " + noOfGuesses + " guesses");
                    running = false;
                }
            }
        }
        else if (choice1 == 2){
            Random rand = new Random();
            int num = rand.nextInt(200);
            System.out.println("Select Difficulty: \n1.Easy (20 Guesses)\n2.Medium (10 Guesses)\n3.Hard (5 Guesses)\n4.Impossible (3 Guesses)\n(The number will be between 0 to 200)\n(1/2/3/4)");
            int choice2 = sc.nextInt();
            int Guesses = 0;
            if (choice2 == 1) {
                Guesses = 20;
            }
            else if (choice2 == 2) {
                Guesses = 10;
            }
            else if (choice2 == 3) {
                Guesses = 5;
            }
            else if (choice2 == 4) {
                Guesses = 3;
            }
            boolean isCorrectNumber = false;
            boolean running = true;
            System.out.println("Guess the number i am thinking of");
            while (running) {
                int takeUserInput = sc.nextInt();
                if (takeUserInput == num) {
                    isCorrectNumber = true;
                }
                else if (takeUserInput > num) {
                    System.out.println("The number is smaller than " + takeUserInput);
                    Guesses--;
                }
                else if (takeUserInput < num) {
                    System.out.println("The number is larger than " + takeUserInput);
                    Guesses--;
                }

                if (isCorrectNumber) {
                    System.out.println("Congratulations, You Guessed the number!\nThe number was " +
                            num + " \nThere were "  + Guesses + " Guesses left");
                    running = false;
                }
                else if (Guesses <= 0){
                    System.out.println("You lost all your guesses, You lose!\nThe number was "+num);
                    running = false;
                }
            }
        }
    }
}

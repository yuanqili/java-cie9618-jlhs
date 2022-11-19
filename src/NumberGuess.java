// TASK

// 1. Supports different game mode (easy, medium, hard)
//    Easy: 1~100, 10
//    Medium: 1~500, 13
//    Hard: 1~2000, 15
// 2. Supports multiple runs of the game, accumulates scores from each run
//    Prints the final score when user exits the game


import java.util.Scanner;

public class NumberGuess {

    // FUNCTION GameDriver() RETURNS INTEGER
    //     generates a random number
    //     while the user has not guessed the correct number
    //         asks for user input
    //         if guess > number
    //             ...
    //         else if guess < number
    //            ...
    //     print cong message
    // ENDFUNCTION
    public static int gameDriver(Scanner scanner, int tries) {
        // double [0, 1) * 100
        // double [0, 100) + 1
        // double [1, 101) -> integer
        int number = (int) (Math.random() * 100 + 1);
        int guess = -1;
        int score = 0;

        while (guess != number && tries > 0) {
            System.out.printf("[%d tries left] Please guess a number in range [1, 100]: ", tries);
            guess = scanner.nextInt();
            tries--;
            if (guess > number) {
                System.out.println("Your guess is larger!");
            } else if (guess < number) {
                System.out.println("Your guess is smaller!");
            }
        }

        if (number == guess) {
            // win
            System.out.printf("Your guess is correct! It is %d\n", number);
            score = tries * tries;
        } else {
            // lose
            System.out.println("You've used all tries!");
        }

        return score;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String option = "";
        int totalScore = 0;

        System.out.println("Welcome to the Number Guess game!");
        System.out.println("[E]asy");
        System.out.println("[Q]uit");

        // Scanner
        // scanner.nextLine() -> "Q\n"
        // scanner.nextLine() -> "E\n"
        // scanner.nextLine() -> "f\n"
        // "Q\n".strip() -> "Q"
        // "    Q     \t \t \n".strip() -> "Q"
        // "    Q     \t Q\t \n".strip() -> "Q     \t Q"

        // Boolean operations
        // ! not
        // && and   & bitwise and
        // || or    | bitwise or
        //          ^ bitwise xor

        do {
            System.out.println("Please select an option from the menu (E/Q): ");
            option = scanner.nextLine().strip();
        } while (!option.equals("E") && !option.equals("Q"));

        if (option.equals("Q")) {
            System.out.println("Goodbye!");
        } else {
            totalScore += gameDriver(scanner, 10);
            System.out.printf("Your current score is %d\n", totalScore);
        }

    }

}

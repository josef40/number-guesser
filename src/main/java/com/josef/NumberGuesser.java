package com.josef;

import java.util.*;

public class NumberGuesser
{
    private static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_RANDOM_NUMBER) + 1;

        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Guess a number between 1 and %d: ", MAX_RANDOM_NUMBER);

        do
        {
            // here we make sure user input is an integer before we continue
            while (!scanner.hasNextInt())
            {
                System.out.print("That's not a valid number. Try again: ");
                scanner.next();
            }

            guess = scanner.nextInt();

            if (guess < randomNumber)
            {
                System.out.print("Too low, try again: ");
            } else if (guess > randomNumber)
            {
                System.out.print("Too high, try again: ");
            }

            attempts++;
        } while (randomNumber != guess);

        System.out.printf("Congrats, you won! It took you %d attempts.%n", attempts);
    }
}
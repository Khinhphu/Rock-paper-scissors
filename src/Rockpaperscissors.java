
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class Rockpaperscissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String personPlay;
        String computerPlay = "";
        int computerInt;

        String response;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Hey, let's play Rock, Paper, Scissors!\n"
                + "Please enter a move. \n " + "Rock = R,  Paper = P, and Scissors = S.");

        System.out.println();

        computerInt = generator.nextInt(3) + 1;

        if (computerInt == 1) {
            computerPlay = "R";
        } else if (computerInt == 2) {
            computerPlay = "P";
        } else if (computerInt == 3) {
            computerPlay = "S";
        }
        System.out.println("Enter your play: ");
        personPlay = scan.next();

        //Make player's play uppercase for ease of comparison 
        personPlay = personPlay.toUpperCase();

        //Print computer's play 
        System.out.println("Computer play is: " + computerPlay);

        //See who won. Use nested ifs 
        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        } else if (personPlay.equals("R")) {
            if (computerPlay.equals("S")) {
                System.out.println("Rock crushes scissors. You win!!");
            } else if (computerPlay.equals("P")) {
                System.out.println("Paper eats rock. You lose!!");
            } else if (personPlay.equals("P")) {
                System.out.println("Paper eats rock, You win!!");
                if (computerPlay.equals("S")) {
                    System.out.println("Scissor cuts paper. You win!!");
                } else if (computerPlay.equals("R")) {
                    System.out.println("Paper eats rock. You lose!!");
                } else if (personPlay.equals("S")) {
                    System.out.println("Scissors cut paper. you win!!");
                    if (computerPlay.equals("P")) {
                        System.out.println("Scissor cuts paper. You lose!!");
                    } else if (computerPlay.equals("R")) {
                        System.out.println("Rock breaks scissors. You win!!");
                    } else {
                        System.out.println("Invalid user input.");
                    }
                }
            }
        }

    }

}

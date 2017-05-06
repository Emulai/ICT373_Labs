/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numguess;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author jaknd
 */
public class NumGuess {

    
    
    
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int rNum, gNum, gCount;
        String pAgain;
        boolean play = true;
        boolean guess = true;
        
        while(play)
        {
            rNum = r.nextInt(1000);
            System.out.println("Guess the number! It is between 0 and 1000 inclusive!");
            guess = true;
            gCount = 0;
            while (guess){
                gCount = gCount + 1;
                System.out.print("Guess: ");
                gNum = input.nextInt();

                if(gNum > rNum){
                    System.out.println("Guess too large! Try again!");
                }else if(gNum < rNum){
                    System.out.println("Guess too small! Try again!");
                }else if (gNum == rNum){
                    System.out.println("Congratulations! You guessed the number!");
                    GoodGuess(gCount);
                    System.out.print("Play again? Y/N: ");
                    pAgain = input.next();
                    
                    switch (pAgain){
                        case "Y":
                        case "y":
                            play = true;
                            guess = false;
                            break;
                        case "N":
                        case "n":
                            play = false;
                            guess = false;
                            break;
                        default:
                            System.out.println("Bad input. Tough luck, you're playing again.");
                            play = true;
                            guess = false;
                            break;
                    }
                    
                    /*if ((pAgain.equals("Y")) || (pAgain.equals("y"))){
                        play = true;
                        break;
                    }else if ((pAgain.equals("N")) || (pAgain.equals("n"))){
                        play = false;
                        break;
                    }else{
                        System.out.println("Bad input. Tough luck, you're playing again.");
                        play = true;
                        break;
                    }*/
                }
            }
            
        }
        
    }
    
    public static void GoodGuess(int p_guess)
    {
        if (p_guess < 10){
            System.out.println(p_guess + " guesses! Either you know the secret or you got lucky!");
        }else if (p_guess > 10){
            System.out.println(p_guess + " guesses! You should be able to do better!");
        }else if (p_guess == 10){
            System.out.println(p_guess + " guesses! Aha! You know the secret!");
        }
    }
    
}

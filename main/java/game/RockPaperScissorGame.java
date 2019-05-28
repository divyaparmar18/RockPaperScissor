import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorGame {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("choose one from 'rock', 'paper' or 'scissor' :-");
            String userGuess = input.nextLine().toLowerCase();
            List<String> options = Arrays.asList("rock", "paper", "scissor");
            if (!options.contains(userGuess)) {
                System.out.println("invalid");
            } else {
                System.out.println(getResult(userGuess, getComputerGuess(options)));
            }
            System.out.println("Do you want to play again ?, if no then put 'no' or else press any button");
            String noReplay = input.nextLine().toLowerCase();
            if(noReplay.equals("no")){
                break;
            }
        }
    }
    public static String getComputerGuess(List<String> options) {
        Random rand = new Random();
        return options.get(rand.nextInt(options.size()));
    }

    public static String getResult(String userGuess, String computerGuess){
        if(userGuess.equals(computerGuess)){
            return "draw";
        }
        else if (userGuess.equals("rock") && computerGuess.equals("scissor")){
            return "you won";
        }
        else if(userGuess.equals("paper") && computerGuess.equals("rock")){
            return "you won";
        }
        else if(userGuess.equals("scissor") && computerGuess.equals("paper")){
            return "you won";
        }
        else{
            return "Sorry ! you lost";
        }
    }


}
